public class PrintTable {

    static void printTable(int n, int i) {
        if(i==0) {
            return;
        }
        printTable(n,i-1);
        System.out.println(i + " X " + n + " = " + i*n);

    }

    public static void main(String[] args) {
        int n = 5;
        printTable(n,3);
    }
}
