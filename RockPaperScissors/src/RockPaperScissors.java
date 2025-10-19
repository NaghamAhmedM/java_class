import java.util.*;

public class RockPaperScissors {
    //Variable Declarations ----------------------------------------------------------------------------------
    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 3;
    private static final int MAX_ROUNDS = 10;
    private static final int MIN_ROUNDS = 1;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    //-------------------------------------------------------------------------------------------------------

    //Main Method (Entry Point) -----------------------------------------------------------------------------
    public static void main(String[] args){
        System.out.println("Welcome to Rock, Paper, Scissors!");

        boolean playAgain = true;
        do{
            int rounds = getNumberOfRounds();
            if(rounds == -1){
                break;
            }

            playGame(rounds);

            System.out.print("\n Do you want to play again? (Yes/No): ");
            String answer = scanner.next();
            if(!answer.equalsIgnoreCase("yes")){
                playAgain = false;
                System.out.println("Thanks for Playing!");
            }

        }while(playAgain);
    }
    //-------------------------------------------------------------------------------------------------------

    //Main Game Flow Methods --------------------------------------------------------------------------------

    //Gets the number of rounds from the user and checks if the input is valid.
    private static int getNumberOfRounds(){
        System.out.println("How many rounds do you want to play? (1-10)");
        int rounds;

        if(scanner.hasNextInt()){
            rounds = scanner.nextInt();
        }else{
            System.out.println("Error: Invalid Input. Number of rounds must be between 1 and 10.");
            return -1;
        }

        if(rounds < MIN_ROUNDS || rounds > MAX_ROUNDS){
            System.out.println("Error: Invalid Input. Number of rounds must be between 1 and 10.");
            return -1;
        }

        return rounds;
    }

    //Inner workings of the game.
    private static void playGame(int rounds){
        int userWins =0;
        int computerWins = 0;
        int ties = 0;

        for(int i = 1; i <= rounds; i++){
            System.out.println("\n --- Round " + i + " ---");

            int userChoice = getUserChoice();
            if(userChoice == -1){
                computerWins ++;
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("You Chose: " + choiceToString(userChoice));
            System.out.println("Computer chose: " + choiceToString(computerChoice));

            int result = determineWinner(userChoice, computerChoice);
            switch(result){
                case 0: {
                    System.out.println("Result: It's a tie!");
                    ties ++;
                    break;
                }
                case 1: {
                    System.out.println("Result: You win this round!");
                    userWins ++;
                    break;
                }
                case 2: {
                    System.out.println("Result: Computer wins this round!");
                    computerWins ++;
                    break;
                }
            }
        }

        displayFinalResults(userWins, computerWins, ties);
    }
    //-------------------------------------------------------------------------------------------------------

    //Helper Methods ----------------------------------------------------------------------------------------

    //Gets user's choice(rock or paper or scissors) and also validates choice.
    private static int getUserChoice(){
        System.out.println("Enter your choice: 1 = Rock, 2 = Paper, 3 = Scissors");
        int choice;

        if(scanner.hasNextInt()){
            choice = scanner.nextInt();
        }else{
            System.out.println("Error: Invalid Choice. Round forfeited");
            return -1;
        }

        if (choice < ROCK || choice > SCISSORS) {
            System.out.println("Error: Invalid Choice. Round forfeited");
            return -1;
        }

        return choice;
    }

    //translates the choice from an integer to a string to be easily read.
    private static String choiceToString(int choice) {
        switch (choice) {
            case ROCK: return "Rock";
            case PAPER: return "Paper";
            case SCISSORS: return "Scissors";
            default: return "Unknown";
        }
    }

    // Returns the value that corresponds with the winner (tie = 0, user wins = 1, computer wins = 2).
    private static int determineWinner(int user, int computer){
        if(user == computer){
            return 0; //tie
        }

        if((user == ROCK && computer == SCISSORS) ||
                (user == PAPER && computer == ROCK) ||
                (user == SCISSORS && computer == PAPER)){
            return 1; //user wins
        }

        return 2; //computer wins
    }

    //Neatly display the final overall result.
    private static void displayFinalResults(int userWins, int computerWins, int ties){
        System.out.println("\n --- Final Results ---");
        System.out.println("Ties: " + ties);
        System.out.println("Your wins: " + userWins);
        System.out.println("Computer wins: " + computerWins);

        if (userWins > computerWins) {
            System.out.println("Overall Winner: YOU!");
        } else if (computerWins > userWins) {
            System.out.println("Overall Winner: COMPUTER!");
        } else {
            System.out.println("Overall Result: It's a tie!");
        }
    }
    //-------------------------------------------------------------------------------------------------------
}
