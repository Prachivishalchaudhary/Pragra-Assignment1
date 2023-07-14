package july22;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);

            char press;
            do {
                System.out.println("Enter any alphabet: ");
                String letter = sc.next();
                if (letter.length() == 1) {


                    if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u" || letter == "A" || letter == "E" || letter == "I" || letter == "O" || letter == "U") {
                        System.out.println(letter + " " + "is a vowel");

                    } else {
                        System.out.println(letter + " " + "is a consonent");

                    }
                }
                else {
                    System.out.println(letter+" "+"is not a letter");
                    System.out.println("error is present");
                }
                System.out.println("you want to tqke exit,y for yes and n for no");

                System.out.println("y or n");
                press=sc.next().charAt(0);
            }
            while(press!='y');
        }






}


