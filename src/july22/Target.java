package july22;

public class Target {
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6,7};
        for (int i = 0; i < array.length-1; i++) {
            int temp= array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
            System.out.println(array[i]);

        }



        }
    }

