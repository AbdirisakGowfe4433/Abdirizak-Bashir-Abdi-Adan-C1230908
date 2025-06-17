import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (0 to stop):");

        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 2) {
                System.out.println(" less than 2 is not a prime");
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + "it's a prime number!!");
            } else {
                System.out.println(number + " No it is not a prime number");
//                break;
            }

//            System.out.println("Enter another number (0 to stop):");
        }
    }
}
