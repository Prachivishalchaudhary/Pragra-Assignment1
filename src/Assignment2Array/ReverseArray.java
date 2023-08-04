package Assignment2Array;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:  ");
        int size = sc.nextInt();
        int array1[] = new int[size];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < size ; i++) {
            array1[i]=sc.nextInt();

        }
        System.out.println("Reverse of array");

        for (int i = size-1 ; i >= 0; i--) {

            System.out.println(array1[i]+" ");
        }



    }

}
