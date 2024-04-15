import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

//        int a = 40;
////        final int b = 10;
////        final int age = 20;
//
//        switch (a) {
//            case 10:
//                System.out.println("A");
//                System.out.println("B");
//                break;
//            case 20:
//                System.out.println("C");
//                System.out.println("F");
//            case 30:
//                System.out.println("D");
//                System.out.println("E");
//        }

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int x = 10;
        int y = 20;
        final int rem = x%y;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println(30);
        }
    }
}