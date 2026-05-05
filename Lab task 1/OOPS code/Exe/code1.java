
package exe;  
import java.util.Scanner;
public class Class1 {
    int factorial(int n){
        int fact=1;   
        for(int i=1; i<=n; i++)
            fact=fact*i;
        return fact;
    }                  
    void pattern(){
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++){   
              System.out.print("*");
            }
         System.out.println();
        }
    }
    int length(){
    int[] arr1 = {10, 20, 30, 40, 50};  
    return arr1.length;
    }
    void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;  
        int reverse = 0;
        while(n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;     
        } 
        if(original == reverse) {
            System.out.println("Palindrome Number");
        } 
        else {
            System.out.println("Not a Palindrome");  
        }
    }
    void Primenum(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();   
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;     
            }
        }
        if(count == 2) {
            System.out.println("Prime Number");
        } 
        else {
            System.out.println("Not a Prime Number");  
        } 
    }
    void swap1(){
        int a = 10, b = 20;
        System.out.println("Before Swapping, a is "+a+" and b is "+b);
        a = a + b;
        b = a - b;   
        a = a - b;
       System.out.println("After Swapping, a is "+a+" and b is "+b);
    }
    void swap2(){        
        int a = 30, b = 20, temp;
        System.out.println("Before Swapping, a is "+a+" and b is "+b);
        temp = a;
        a = b;         
        b = temp;

         System.out.println("After Swapping, a is "+a+" and b is "+b);
    }     
}
