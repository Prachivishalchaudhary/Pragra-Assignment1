package july22;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        System.out.println("Natural number is");
        while(number<=10){


            System.out.println(number);

            number++;

            sum = sum + number;


        }
        System.out.println("sum of natural numbers is");
        System.out.println(sum);
  }
}
