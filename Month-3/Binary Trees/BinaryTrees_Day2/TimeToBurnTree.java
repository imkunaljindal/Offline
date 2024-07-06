import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        int k = sc.nextInt();
        sc.close();
        Node tree = levelOrderCreateTree(arr);
        System.out.println(timeToBurnTree(tree, k));
    }

    public static Node findNode(Node root, int start) {
        if(root==null) return null;
        if(root.data==start) {
            return root;
        }
        Node leftC = findNode(root.left,start);
        if(leftC!=null) {
            return leftC;
        }
        Node rightC = findNode(root.right,start);
        if(rightC!=null) {
            return rightC;
        }
        return null;
    }

    public static int timeToBurnTree(Node root, int start) {
        Map<Node,Node> childParentMap = new HashMap<>();
        prepareMapping(root,childParentMap); // O(n)

        Node startNode = findNode(root,start); // O(n)

        Queue<Node> q = new ArrayDeque<>();
        Set<Node> burntNodes = new HashSet<>();
        q.add(startNode);
        burntNodes.add(startNode);
        int time = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                Node curr = q.remove();
                if(curr.left!=null && burntNodes.contains(curr.left)==false) {
                    q.add(curr.left);
                    burntNodes.add(curr.left);
                }
                if(curr.right!=null && burntNodes.contains(curr.right)==false) {
                    q.add(curr.right);
                    burntNodes.add(curr.right);
                }
                // burn my parent as well if present
                if(childParentMap.get(curr)!=null && burntNodes.contains(childParentMap.get(curr))==false) {
                    q.add(childParentMap.get(curr));
                    burntNodes.add(childParentMap.get(curr));
                }
            }
            time++;
        }

        return time;
    }

    private static void prepareMapping(Node root,
                                       Map<Node,Node> childParentMap) {

        if(root==null) return;
        childParentMap.put(root.left,root);
        childParentMap.put(root.right,root);
        prepareMapping(root.left,childParentMap);
        prepareMapping(root.right,childParentMap);

    }

    static void createTree(Node node, int i, String[] arr) {
        if (node != null) {
            if (2 * i + 1 < arr.length) {
                if (arr[2 * i + 1].equals("null")) {
                    node.left = null;
                } else {
                    node.left = new Node(Integer.parseInt(arr[2 * i + 1]));
                }
                createTree(node.left, 2 * i + 1, arr);
            }
            if (2 * i + 2 < arr.length) {
                if (arr[2 * i + 2].equals("null")) {
                    node.right = null;
                } else {
                    node.right = new Node(Integer.parseInt((arr[2 * i + 2])));
                }
                createTree(node.right, 2 * i + 2, arr);
            }
        }
    }

    static Node levelOrderCreateTree(String[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(
                Integer.parseInt(arr[0])
        );
        createTree(head, 0, arr);
        return head;
    }
}

class TimeToBurnTree {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
