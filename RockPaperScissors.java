import java.util.*;

public class RockPaperScissors {
    static int userScore = 0;
    static int computerScore = 0;
    static int tieScore = 0;
    static int userChoice = 0;
    static int computerChoice = 0;
    static int round = 1;
    static Scanner input = new Scanner(System.in);
    static int totalRounds = 0;

    public static void welcomeMessage() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("\n     Game Rules     ");
        System.out.println("1. Rock beats Scissors");
        System.out.println("2. Scissors beats Paper");
        System.out.println("3. Paper beats Rock\n");
    }

    public static void run() {
        System.out.print("How many rounds would you like to play? ");
        totalRounds = input.nextInt();

        while (totalRounds <= 0) {
            System.out.print("Please enter a positive number: ");
            totalRounds = input.nextInt();
        }

        while (round <= totalRounds) {
            System.out.println("\nRound " + round);
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("\nEnter your choice: ");
            userChoice = input.nextInt();

            computerChoice = (int) (Math.random() * 3) + 1;

            System.out.println();
            // display computer choice
            if (computerChoice == 1) {
                System.out.println("Computer chose Rock.");
            } else if (computerChoice == 2) {
                System.out.println("Computer chose Paper.");
            } else {
                System.out.println("Computer chose Scissors.");
            }

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
                tieScore++;
            } else if (userChoice == 1 && computerChoice == 3) {
                System.out.println("You win!");
                userScore++;
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("You win!");
                userScore++;
            } else if (userChoice == 3 && computerChoice == 2) {
                System.out.println("You win!");
                userScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }
            round++;
        }

        System.out.println("\n\n     Game Summary\n");
        System.out.println("You won " + userScore + " times.");
        System.out.println("Computer won " + computerScore + " times.");
        if (tieScore > 0)
            System.out.println("There were " + tieScore + " ties.\n");

        if (userScore > computerScore) {
            System.out.println("You won the game!");
        } else if (userScore < computerScore) {
            System.out.println("Computer won the game!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
