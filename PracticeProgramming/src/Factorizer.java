import java.lang.reflect.Array;
import java.util.*;

public class Factorizer {

    //Global variable List -------------------------------------------------------------
    static ArrayList<Integer> factorList = new ArrayList<Integer>();
    static boolean isPerfect;
    static int factorSum = 0; //used to ensure wither a factor is perfect of not
    static boolean isPrime;
    //----------------------------------------------------------------------------------

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userNumber;

        System.out.println("What number would you like to factor?");
        userNumber = sc.nextInt();

        printFactors(userNumber);
        printIfPerfect(userNumber);
        printIfPrime(userNumber);
    }

    static void printFactors(int number){
        // gathering the factors in an Array List
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factorList.add(i);
                factorSum += i;
            }
        }
        System.out.println("The factors of " + number + " are:");
        System.out.println(factorList);
        System.out.println(number + " has " + factorList.size() + " factors.");
    }

    static void printIfPerfect(int number){
        //checking if perfect number
        if((factorSum - number) == number){
            isPerfect = true;
            System.out.println(number + " is a perfect number.");
        }else{
            isPerfect = false;
            System.out.println(number + " is not a perfect number.");
        }
    }

    static void printIfPrime(int number){
        if(factorList.size() > 2){
            isPrime = false;
            System.out.println(number + " is not a prime number.");
        }else{
            isPrime = true;
            System.out.println(number + " is a prime number.");
        }
    }
}
