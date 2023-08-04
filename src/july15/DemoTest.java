package july15;
import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char press;
        do{
            System.out.println("hello");
            System.out.println("you want to take exit");
            System.out.println("press y FOR EXIT n for stay here ");
            press=sc.next().charAt(0);
        }
        while(press == 'n'|| press == 'N');
    }
}
