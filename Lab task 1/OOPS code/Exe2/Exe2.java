package exe2;

import java.util.Scanner;
public class Exe2 {
       
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter first number");
      double a=s.nextDouble();
      System.out.println("Enter second number");        
      double b=s.nextDouble();
      AdvancedCalculator k=new AdvancedCalculator();
      k.setvalues(a,b);
      System.out.println("Addition: "+k.add());        
      System.out.println("Subtarction: "+k.subtract());
      System.out.println("Multiplication: "+k.multiply());
      System.out.println("Division: "+k.divide());       
    }
}