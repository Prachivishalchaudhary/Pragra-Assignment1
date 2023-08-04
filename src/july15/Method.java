package july15;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Method {



    public static int sum(int number1,int number2,int number3){
        int sum = number1+number2+number3;
        return sum;
    }
    public static int subtract(int number1,int number2){
        int subtract = number1-number2;
        return subtract;
    }
    public static int product(int number1,int number2,int number3){
        int product = number1*number2*number3;
        return product;
    }
    public static int divide(int number1,int number2){
        int divide = number1/number2;
        return divide;
    }
    public static int modulo(int number1,int number2){
        int modulo = number1%number2;
        return modulo;
    }

}
