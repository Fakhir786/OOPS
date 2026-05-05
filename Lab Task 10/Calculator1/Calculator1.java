
package calculator1;

import java.util.Scanner;

public class Calculator1 {
  int sum(int a, int b, int c){
        return a+b+c;
  }
  int sum(int a,int b){
      return a+b;
  }
  int sub(int a,int b,int c){
      return a-b-c;
  }
  int sub(int a,int b){
      return a-b;
  }
  int product(int a,int b, int c){
      return a*b*c;
  }
  int product(int a,int b){
      return a*b;
  }
  int div(int a,int b){
      return a/b;
  }
   int div(int a,int b,int c){
       return (a/b)/b;
   }
    public static void main(String[] args) {
     int a,b,c;
     Calculator1 k=new Calculator1();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter values: 90");
             a=s.nextInt();
             b=s.nextInt();
             c=s.nextInt();
             int result=k.sum(a,b,c);
             System.out.println("The sum of: "+a+" , "+b+" and "+c+" is "+result);
             result=k.sum(a,b);
             System.out.println("The sum of: "+a+" and "+b+" is "+result);
             result=k.sub(a,b,c);
             System.out.println("The subtraction of "+a+" , "+b+" and "+c+" is "+result);
             result=k.sub(a,b);
             System.out.println("The subtraction of "+a+" and "+b+" is "+result);
             result=k.product(a,b,c);
             System.out.println("The Product of: "+a+","+b+" and "+c+" is "+result);
             result=k.product(a,b);
             System.out.println("The product of "+a+" and "+b+" is "+result);
             result=k.div(a,b,c);
             System.out.println("The div of: "+a+" , "+b+" and "+c+" is "+result);
             result=k.div(a,b);
             System.out.println("The Division of "+a+" and "+b+" is "+result);
    }
    }
    

