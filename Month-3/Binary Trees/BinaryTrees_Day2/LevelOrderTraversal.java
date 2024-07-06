import java.util.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}



class BST{
    Node root = null;
    BST(){

    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void levelOrderTraversal(Node root){
        if(root==null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node frontNode = q.remove();
                System.out.print(frontNode.val + " ");
                if (frontNode.left != null) {
                    q.add(frontNode.left);
                }
                if (frontNode.right != null) {
                    q.add(frontNode.right);
                }
            }
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }

        t.levelOrderTraversal(t.root);

    }
}