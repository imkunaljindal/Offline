import java.util.*;

public class DesignBrowserHistory {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String homepage = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        BrowserHistory browserHistory = new BrowserHistory(homepage);
        for(int i = 0; i < n; i++) {
            String q = sc.nextLine();
            String[] query = q.split("\\s+");
            if(query[0].equals("visit")){
                browserHistory.visit(query[1]);
            } else if(query[0].equals("back")){
                browserHistory.back(Integer.parseInt(query[1]));
            } else if(query[0].equals("forward")){
                browserHistory.forward(Integer.parseInt(query[1]));
            }
        }
    }
}
class BrowserHistory {
    class Node {
        int key; // page number
        String url;
        Node next;
        Node prev;
        public Node(int key, String url) {
            this.key = key;
            this.url = url;
            next = null;
            prev = null;
        }
    }

    Node head;
    Node tail;
    Node curr;
    int size;
    public BrowserHistory(String homepage) {
        Node homePage = new Node(0,"homepage");
        head = homePage;
        tail = homePage;
        curr = homePage;
        size = 0;
    }

    // add a node to end of the list
    public void visit(String url) {
        size++;
        Node newNode = new Node(size,url);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        curr = tail;
    }
    public void back(int steps) {
        while(curr.key != 0 && steps > 0) {
            curr = curr.prev;
            steps--;
        }
    }
    public void forward(int steps) {
        while(curr.key != size && steps > 0) {
            curr = curr.next;
            steps--;
        }
    }
}