package com.sg.foundations.flowcontrol.random;
import java.util.*;

public class GuessMeMore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rGen = new Random();

        int userGuess;
        int randomNumber = rGen.nextInt(201) -100;
        boolean guessCheck = false;

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");

        do{
        userGuess = sc.nextInt();
        System.out.println("your guess: " + userGuess);

        if(userGuess < randomNumber){
            System.out.println("Ha, nice try - too low! Try again!");
        }else if(userGuess > randomNumber){
            System.out.println("Ha, nice try - too high! Try again!");
        }else if(userGuess == randomNumber){
            System.out.println("Wow, nice guess! That was it!");
            guessCheck = true;
        }

        }while(!guessCheck);

    }
}
