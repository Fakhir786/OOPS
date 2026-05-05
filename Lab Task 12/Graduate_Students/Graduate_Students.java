
package graduate_students; //Fakhir Ashar Chaudhry 72990
import java.util.Scanner;
public class Graduate_Students extends Students { //Fakhir Ashar Chaudhry 72990
         void grade(int a,int b){
            int p=(a/b)*100;
            if(p>=80||p<=100)//Fakhir Ashar Chaudhry 72990
            System.out.println("A");
         else   if(p>=60||p<=79)
        System.out.println("B");
          else    if(p>=50||p<=59)//Fakhir Ashar Chaudhry 72990
        System.out.println("C");
          else    if(p>=40||p<=49)
        System.out.println("D");
            else
              System.out.println("Fail");//Fakhir Ashar Chaudhry 72990
         }
    public static void main(String[] args) {
        int a,b;
      Scanner k=new Scanner(System.in);//Fakhir Ashar Chaudhry 72990
      System.out.println("Enter marks of OOP");
      a=k.nextInt();//Fakhir Ashar Chaudhry 72990
        Students s=new Graduate_Students();
        System.out.println("Enter total marks of OOP");//Fakhir Ashar Chaudhry 72990
        b=k.nextInt();
        s.grade(a,b);
        s.show();//Fakhir Ashar Chaudhry 72990
    }   
}
