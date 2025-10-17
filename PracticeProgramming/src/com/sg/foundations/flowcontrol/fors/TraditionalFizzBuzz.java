package com.sg.foundations.flowcontrol.fors;
import java.util.*;

public class TraditionalFizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;
        String stringNumber;
        int fizzBuzzCount = 0;

        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        stringNumber = sc.nextLine();
        number = Integer.parseInt(stringNumber);

        for(int i=0; fizzBuzzCount <= number; i++){

            if(i%3 == 0 && i%5 ==0){
                System.out.println("Fizz Buzz");
                fizzBuzzCount ++;
            } else if (i%3 == 0) {
                System.out.println("Fizz");
                fizzBuzzCount ++;
            } else if (i%5 == 0) {
                System.out.println("Buzz");
                fizzBuzzCount ++;
            }else {
                System.out.println(i);
            }

        }
        System.out.println("TRADITION!!!!!");
    }
}
