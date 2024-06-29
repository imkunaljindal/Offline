import java.util.*;

class MinStack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int q = sc.nextInt();
            Solution1 g = new Solution1();
            while(q>0)
            {
                int qt = sc.nextInt();

                if(qt == 1)
                {
                    int att = sc.nextInt();
                    g.push(att);
                }
                else if(qt == 2)
                {
                    System.out.print(g.pop()+" ");
                }
                else if(qt == 3)
                {
                    System.out.print(g.getMin()+" ");
                }

                q--;
            }
            System.out.println();
            T--;
        }
        sc.close();

    }
}

class Pair {
    int val;
    int minValue;
    public Pair(int val, int minVal) {
        this.val = val;
        this.minValue = minVal;
    }
}

class Solution1
{
    int minEle;
    Stack<Pair> s;

    Solution1()
    {
        s = new Stack<Pair>();
    }

    void push(int x){
        if (s.isEmpty()) {
            s.push(new Pair(x, x));
        }
        else {
            int currMin = s.peek().minValue;
            s.push(new Pair(x,Math.min(x,currMin)));
        }
    }

    int pop(){
        if(s.isEmpty()) return -1;

        Pair p = s.pop();
        return p.val;
    }

    int getMin(){
        return s.peek().minValue;
    }
}
