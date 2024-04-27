public class FunctionConcept {
    static void printA() {
        System.out.println("A");
    }
    static void printB(){
        System.out.println("B");
    }
    static int diff(int x, int y){
        printA();
        printB();
        return x-y;
    }

    public static void main(String[] args) {
        System.out.println(diff(10,5));
    }
}
