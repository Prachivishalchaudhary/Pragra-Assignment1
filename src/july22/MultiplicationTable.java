package july22;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for product : ");
        int productor = sc.nextInt();

        System.out.println("product of"+" "+productor);

        int number = 1;
        while(number<=10) {

            System.out.println(number * productor);
                number++;
            }
  }
}

