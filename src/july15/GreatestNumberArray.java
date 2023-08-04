package july15;

public class GreatestNumberArray {
    public static void main(String[] args) {
        int array[] = {6,9,12,8,5};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
                System.out.println(array[i]);
                System.out.println(i);
            }
        }
    }
}
