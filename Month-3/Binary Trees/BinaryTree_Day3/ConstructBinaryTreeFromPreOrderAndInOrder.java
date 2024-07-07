import java.util.*;
import java.io.*;
class Node{
    int data;
    Node left, right;
    Node(int key){
        data = key;
        left = right = null;
    }
}

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        int inorder[] = new int[n];
        int preorder[] = new int[n];
        for(int i = 0; i < n; i++)
            preorder[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
            inorder[i] = sc.nextInt();
        Solution ob = new Solution();
        root = ob.buildTree(inorder, preorder, n);
        postOrdrer(root);
        System.out.println();
    }

    public static void postOrdrer(Node root){
        if(root == null)
            return;
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}


class Solution{
    public static Node construct(int[] preOrder, int preStart, int preEnd,
                                 int [] inorder, int inStart, int inEnd) {

        if((inEnd < inStart) || (preEnd < preStart)) {
            return null;
        }

        Node root = new Node(preOrder[preStart]);
        int numberOfNodesInLST = 0;
        int i = inStart;
        while(inorder[i]!=preOrder[preStart]) {
            i++;
            numberOfNodesInLST++;
        }

        root.left = construct(preOrder,preStart+1,preStart+numberOfNodesInLST,inorder, inStart,i-1);
        root.right = construct(preOrder,preStart+numberOfNodesInLST+1,preEnd,inorder,i+1,inEnd);
        return root;


    }

    public static Node buildTree(int inorder[], int preorder[], int n){
        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}
