import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");

        while (true) {
            String word = input.nextLine();

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);

            if (firstLetter == lastLetter) {
                System.out.println(word + "it's palindrome");
            } else {
                System.out.println(word + " it's not a palindrome");
                break;
            }

            System.out.println("Enter another word:");
        }
    }
}
