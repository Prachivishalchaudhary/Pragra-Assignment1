package july22;
import java.util.Scanner;
public class SumOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int sum = 0;
        for(int counter = 0;counter<=number;counter++){
            if(counter%2!=0){
                sum = sum + counter;
            }

        }
        System.out.println("sum of odd numbers is"+" "+sum);
    }
}
