package Assignment2Array;
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter your numbers : ");
        for(int i=0;i<size;i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for(int i=1;i<size;i++) {

            if(min>array[i]){
                min=array[i];


                System.out.println("Minimum number is : ");
                System.out.println(array[i]);
                System.out.println("at"+" "+i);

            }
        }

    }
}
