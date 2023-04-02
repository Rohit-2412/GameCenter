import java.util.Scanner;

public class GuessNumber {

    public static void welcomeMessage() {
        System.out.println("<------------- Welcome to Guess a Number! ------------->\n");
        System.out.println("The computer will generate a random number between 0 and 500.");
        System.out.println("You will have to guess the number.");
        System.out.println("\nIf your guess is too high, the computer will tell you.");
        System.out.println("If your guess is too low, the computer will tell you.");
        System.out.println("If you guess the number, the computer will tell you.");
        System.out.println("You will have to guess the number in the least amount of guesses.");
        System.out.println("\nGood luck!\n");
    }

    public static void run() {
        int number = (int) (Math.random() * 500);
        Scanner input = new Scanner(System.in);
        int guess = -1;
        int guessCount = 0;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            guessCount++;
            System.out.println(number);
            if (guess == number) {
                System.out.println("\nYes, the number is " + number);
                System.out.println("You guessed the correct number in " + guessCount + " times");
            } else if (guess > number) {
                System.out.println("Your guess is too high\n");
            } else {
                System.out.println("Your guess is too low\n");
            }
        }
    }
}
