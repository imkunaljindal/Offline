class Complex {
    int real;
    int imaginary;

    public Complex() {

    }
    public Complex(int x, int y){
        real = x;
        imaginary = y;
    }

    public void print() {
        System.out.println(real + "+" + imaginary + "i" );
    }

    public void add(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }
 }

public class Concept2 {

//    static Complex add(Complex c1, Complex c2) {
//        Complex ans = new Complex();
//        ans.real = c1.real + c2.real;
//        ans.imaginary = c1.imaginary + c2.imaginary;
//        return ans;
//    }

    static Complex subtract(Complex c1, Complex c2) {
        Complex ans = new Complex();
        ans.real = c1.real - c2.real;
        ans.imaginary = c1.imaginary - c2.imaginary;
        return ans;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(6,11);
//        c1.print();

        Complex c2 = new Complex(4,9);
        c2.add(c1);
        c2.print();
        c1.print();

//        Complex addedNum = add(c1,c2);
//        addedNum.print();
//
//        Complex subNum = subtract(c1,c2);
//        subNum.print();
    }
}
