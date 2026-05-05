
package exe;
   import java.util.Scanner;   
     
public class Exe { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Class1 a= new Class1();
        int result=a.factorial(n);
        System.out.println("Factorial is: "+result);   
        a.pattern();
        int result2=a.length();
        System.out.println("Length of array is: "+result2);
        a.palindrome();
        a.Primenum();  
        a.swap1();
        a.swap2();
    }   
}
    