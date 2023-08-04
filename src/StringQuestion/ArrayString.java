package StringQuestion;

public class ArrayString {
    public static void main(String[] args) {
        String s1 = new String("pragra");
        char ch[] = s1.toCharArray();
        System.out.println("Array of string is :");
        for (char c:ch) {
            System.out.print(c+" ");
        }
    }
}
