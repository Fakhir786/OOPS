package exe2;

      
public class AdvancedCalculator extends Calculator {
    double multiply(){       
    return num1*num2;
    }
    double divide(){
        if(num2==0){       
            System.out.println("Cannot divide by zero");
        return 0;       
        }
        return num1/num2;
    }       
}