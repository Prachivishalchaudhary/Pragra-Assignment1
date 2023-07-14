package july22;

import java.util.Scanner;

public class Cube {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char press;
            do{
                System.out.println("Enter any number : ");
                int number = sc.nextInt();
                int ans = number*number*number;
                System.out.println("cube of number is");
                System.out.println(ans);
                System.out.println("you want to take exit");
                System.out.println("yes for y and n for no");
                System.out.println("press y or n");
                press = sc.next().charAt(0);
            }
            while(press != 'y');
        }
}

