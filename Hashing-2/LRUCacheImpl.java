import java.util.*;

public class LRUCacheImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt(), q = sc.nextInt();
        String[] queries = new String[q];
        for (int i = 0; i < q; i++) {
            String s = sc.next();
            if (s.equals("GET"))
                s += " " + sc.nextInt();
            else
                s += " " + sc.nextInt() + " " + sc.nextInt();
            queries[i] = s;
        }
        sc.close();
        LRUCache lruCache = new LRUCache(cap);
        for (String s : queries) {
            String[] arr = s.split(" ");
            if (arr.length == 3)
                lruCache.set(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            else
                System.out.println(lruCache.get(Integer.parseInt(arr[1])));
        }
    }
}

class Node {
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int val) {
        this.key = key;
        this.value = val;
    }
}

class LRUCache {
    Node head;
    Node tail;
    int maxCapacity;
    HashMap<Integer,Node> map; // key to be searched, node to be returned

    public LRUCache(int capacity) {
        head = new Node(-1,-1);
        tail = head;
        head.next = tail;
        tail.prev = head;
        this.maxCapacity = capacity;
        map = new HashMap<>();
    }

    void addToTail(Node node) {
       tail.prev.next = node;
       node.prev = tail.prev;

       node.next = tail;
       tail.prev = node;

    }

    void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        node.next = null;
        node.prev = null;
    }

   void moveToLast(Node node) {
        removeNode(node);
        addToTail(node);
   }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            moveToLast(node);  // latest accessed record
            return node.value;
        }
        else {
            return -1;
        }
    }

    public void set(int key, int value) {
        if(map.containsKey(key)==false) {
            Node node = new Node(key, value);
            if (map.size() == maxCapacity) {
                Node LRUNode = head.next;
                removeNode(LRUNode);
                map.remove(LRUNode.key);
            }
            addToTail(node);
            map.put(key, node);
        }
        else {
           Node node = map.get(key);
           node.value = value;
           moveToLast(node);
        }
    }
}