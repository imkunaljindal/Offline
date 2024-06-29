import java.util.ArrayList;
import java.util.Stack;

class MyStack {
    private ArrayList<Integer> arr;
    public MyStack() {
        arr = new ArrayList<>();
    }

    public void push(int x) {
        arr.add(x);
    }

    public void pop() {
        int size = arr.size();
        if(size==0) {
            System.out.println("Stack is empty");
        }
        else {
            arr.remove(size-1);
        }
    }

    public int peek() {
        return arr.get(arr.size()-1);
    }

    public int size() {
        return arr.size();
    }

    public boolean isEmpty() {
        return arr.size()==0;
    }
}

public class ImplementStack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(12);
        st.push(65);
        st.push(100);
        st.pop();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.push(190);
        System.out.println(st.peek());
    }
}
