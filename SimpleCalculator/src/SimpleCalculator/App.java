package SimpleCalculator;
import java.util.*;

public class App {
    public static void main(String[] args) {
        SimpleCalculator calculate = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);

        int operationChosen;

        System.out.println("Welcome to the Simple Calculator App!");
        boolean continueOperation = true;

        do{
            System.out.println("What operation would you like to perform? (Choose from 1 to 5)");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit Program");

            int userInput = scanner.nextInt();

            if ((userInput < 1) || (userInput > 5)) {
                System.out.println("Invalid Input. Please choose a valid input from 1 to 5.");
                continueOperation = false;
                break;
            }

            if (userInput == 5) {
                System.out.println("Thank You for using this APP!");
                continueOperation = false;
                break;
            }

            System.out.println("what is your first operand?");
            double opernad1 = scanner.nextInt();

            System.out.println("what is your second operand?");
            double opernad2 = scanner.nextInt();

            double result = 0;
            switch (userInput){
                case 1:{
                    result = calculate.addition(opernad1, opernad2);
                    break;
                }
                case 2:{
                    result = calculate.subtraction(opernad1, opernad2);
                    break;
                }
                case 3:{
                    result = calculate.multiplication(opernad1, opernad2);
                    break;
                }
                case 4:{
                    result = calculate.division(opernad1, opernad2);
                    break;
                }
            }

            System.out.println("The result of your operation is : " + result);
        }while(continueOperation);
    }
}
