import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StateCapitals2 {

    public static void main(String[] args) throws Exception{

        // Create a HashMap to hold state-capital pairs
        HashMap<String, String> stateCapitals = new HashMap<>();


        // Load the HashMap from file
        File file = new File("StateCapitals.txt"); // file should be in the project root
        Scanner fileReader = new Scanner(file);

        // Each line should look like: State::Capital
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine().trim();
            if (!line.isEmpty()) {
                String[] parts = line.split("::");
                if (parts.length == 2) {
                    stateCapitals.put(parts[0].trim(), parts[1].trim());
                }
            }
        }
        fileReader.close();


        // Print how many pairs were loaded
        System.out.println("Loaded " + stateCapitals.size() + " state/capital pairs.\n");

        // Print all the state names
        System.out.println("LIST OF STATES:");
        for (String state : stateCapitals.keySet()) {
            System.out.println(state);
        }

        // --- Knowledge Game -------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nHow many states would you like to guess? ");
        int numQuestions = 1;
        try {
            numQuestions = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Defaulting to 1 question.");
        }

        // Convert key set to a list for random access
        List<String> statesList = new ArrayList<>(stateCapitals.keySet());
        Collections.shuffle(statesList); // Randomize order

        int score = 0;
        for (int i = 0; i < numQuestions && i < statesList.size(); i++) {
            String state = statesList.get(i);
            String correctCapital = stateCapitals.get(state);

            System.out.print("\nWhat is the capital of " + state + "? ");
            String userAnswer = input.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The capital of " + state + " is " + correctCapital + ".");
                score--;
            }
        }

        System.out.println("\nYour total score: " + score);
        System.out.println("Thanks for playing!");
        input.close();
    }
}