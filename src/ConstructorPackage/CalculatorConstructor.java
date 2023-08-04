package ConstructorPackage;
class Calculator{
    private double num1;
    private double num2;
    public Calculator(){
        System.out.println("For calculation,go to parameterised constructor");
    }
    public Calculator(double num1,double num2){
        this();
        this.num1=num1;
        this.num2=num2;
    }
    public void getAdd(){
        System.out.print("Sum of num1 and num2 : "+" "+(num1+num2));
        System.out.println();
    }
    public void getSubtract(){
        System.out.print("Subtract of num1 and num2 : "+" "+(num1-num2));

    }

    public void getProduct(){
        System.out.print("Product of num1 and num2 : "+" "+(num1*num2));
        System.out.println();
    }
    public void getDivide(){
        System.out.print("Divide of num1 and num2 : "+" "+(num1/num2));
        System.out.println();
    }





}

public class CalculatorConstructor {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(12.2,12);
        calculator.getAdd();
        calculator.getSubtract();
        calculator.getProduct();
        calculator.getDivide();
    }
}
