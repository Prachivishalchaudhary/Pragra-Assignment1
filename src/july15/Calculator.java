package july15;

public class Calculator {
    public static void main(String[] args) {

        int ans1 = Method.sum(2,4,5);
        System.out.println("Your ans from sum : "+" "+ans1);

        int ans2 = Method.product(3,4,6);
        System.out.println("Your ans from product : "+" "+ans2);
        int ans3 = Method.subtract(5,2);
        System.out.println("Your ans from subtract : "+" "+ans3);
        int ans4 = Method.divide(10,5);
        System.out.println("Your ans from divided: "+" "+ans4);
        int ans5 = Method.modulo(29,3);
        System.out.println("Your ans from modulo: "+" "+ans5);

    }
}
