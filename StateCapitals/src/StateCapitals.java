import java.util.HashMap;
import java.util.Map;

public class StateCapitals {

    public static void main(String[] args) {

        // Create a HashMap to store state-capital pairs
        HashMap<String, String> stateCapitals = new HashMap<>();

        // Hard-code the state and capital pairs
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Connecticut", "Hartford");
        stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("Georgia", "Atlanta");

        // Print all state names
        System.out.println("LIST OF STATES:");
        for (String state : stateCapitals.keySet()) {
            System.out.println(state);
        }

        System.out.println("\nLIST OF CAPITALS:");
        // Print all capital names
        for (String capital : stateCapitals.values()) {
            System.out.println(capital);
        }

        System.out.println("\nSTATES AND THEIR CAPITALS:");
        // Print each state along with its capital
        for (Map.Entry<String, String> entry : stateCapitals.entrySet()) {
            System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue() + ".");
        }
    }
}
