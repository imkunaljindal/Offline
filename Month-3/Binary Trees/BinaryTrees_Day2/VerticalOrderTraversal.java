import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
import java.lang.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Solution {
    int minHd;
    int maxHd;
    Map<Integer,List> distNodesMap;
    public void traverse(TreeNode root,
                                int hd) {
        if(root==null) return;

        if(!distNodesMap.containsKey(hd)) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(root.data);
            distNodesMap.put(hd,arr);
            minHd = Math.min(minHd,hd);
            maxHd = Math.max(maxHd,hd);
        }
        else {
            List<Integer> arr = distNodesMap.get(hd);
            arr.add(root.data);
            distNodesMap.put(hd,arr);
        }

        traverse(root.left,hd-1);
        traverse(root.right, hd+1);

    }

    List<List<Integer>> VerticalTraversal(TreeNode root) {
        distNodesMap = new HashMap<>();
        traverse(root,0);  // O(n)

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=minHd;i<=maxHd;i++) {
            List<Integer> nodes = distNodesMap.get(i);
            Collections.sort(nodes);
            ans.add(nodes);
        }
        return ans;
    }
}

class Main {

    static TreeNode buildTree(String str) {
        if(str.length()==0 || str.charAt(0)=='N')
            return null;

        String ip[] = str.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(ip[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            TreeNode currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            TreeNode root = buildTree(s);
            Solution ob = new Solution();
            List<List<Integer>> ans = ob.VerticalTraversal(root);
            for(int i = 0; i < ans.size(); i++) {
                for(int a : ans.get(i)) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            System.out.println();
            t--;
        }
    }
}