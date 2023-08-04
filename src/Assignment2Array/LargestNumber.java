package Assignment2Array;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter your numnbers : ");
        for(int i=0;i<size;i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for(int i=1;i<size;i++) {

                if(array[i]>max){
                    max=array[i];
                    System.out.println("Enter the greatest number : ");
                    System.out.print(array[i]);
                }
            }
        }


    }

