
package calculator;
//Fakhir Ashar Chaudhry 72990
public class Calculator {
    void sum() {
        int a, b, c;
        a = 5;
        b = 6;
        c = a + b;
        System.out.println("the result is " + c);//Fakhir Ashar Chaudhry 72990
    }

    void sum(int a, int b) {
        int c = a + b;
        System.out.println("the result is " + c);
    }//Fakhir Ashar Chaudhry 72990

    void sum(float a, int b) {
        double c = a + b;
        System.out.println("the result is " + c);//Fakhir Ashar Chaudhry 72990
    }

    void sum(int a, int b, int c) {
        int res = a + b + c;
        System.out.println("the result is " + res);//Fakhir Ashar Chaudhry 72990
    }

    public static void main(String[] args) {//Fakhir Ashar Chaudhry 72990
        int a, b, c;
        a = 10;
        b = 15;
        c = 20;

        Calculator obj = new Calculator();//Fakhir Ashar Chaudhry 72990

        obj.sum(a, b, c);
        obj.sum(2.5f, 5);
        obj.sum(a, b);//Fakhir Ashar Chaudhry 72990
    }
}
