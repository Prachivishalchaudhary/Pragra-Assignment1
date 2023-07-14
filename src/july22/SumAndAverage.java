package july22;

import java.util.Scanner;

public class SumAndAverage {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter five numbers:");
            char press;
            do{
                System.out.println("First number:");
                int number1 = sc.nextInt();
                System.out.println("second number:");
                int number2 = sc.nextInt();
                System.out.println("third number:");
                int number3 = sc.nextInt();
                System.out.println("Fourth number:");
                int number4 = sc.nextInt();
                System.out.println("Fifth number:");
                int number5 = sc.nextInt();
                int sum = number1 + number2 + number3 + number4 + number5;
                System.out.println("Sum of numbers: ");
                System.out.println(sum);
                int average = sum / 5;
                System.out.println("average of numbers is");
                System.out.println(average);
                System.out.println("you want to take exit");
                System.out.println("press y for yes and n for no");
                press = sc.next().charAt(0);
            }
            while(press != 'y');


    }
}
