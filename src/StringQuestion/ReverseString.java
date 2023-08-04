package StringQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = new String("Pragra");
        char ch[] = s1.toCharArray();
        System.out.println("Reverse of string: " );
        for(int i = ch.length-1; i >= 0; i--) {
            System.out.print(ch[i]+" ");
        }
    }
}
