package july22;


import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char press;
        do {
                System.out.println("Enter three numbers: ");
                System.out.println("first number is ");
                int number1 = sc.nextInt();
                System.out.println("second number is ");
                int number2 = sc.nextInt();
                System.out.println("third number is ");
                int number3 = sc.nextInt();
                if(number1>number2&&number1>number3){
                    System.out.println("Greatest number is"+" " +number1);
                }
                else if(number2>number3&&number2>number1){
                    System.out.println("Gretest number is"+" "+number2);
                }
                else{
                    System.out.println("Grestest number is"+" "+number3);
                }
                System.out.println("You want to take exit");
                System.out.println("Press y for yes and n for no");
                System.out.println("Press y or n");
                press = sc.next().charAt(0);
            }
            while(press != 'y');

  }
}