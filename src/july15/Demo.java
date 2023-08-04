package july15;
class Test{
    private double num1;
    private double num2;
    public Test(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void getSubtract(){
        System.out.println(num1-num2);
    }
}

public class Demo {
    public static void main(String[] args) {
        Test obj = new Test(12,12);
        obj.getSubtract();
    }
}
