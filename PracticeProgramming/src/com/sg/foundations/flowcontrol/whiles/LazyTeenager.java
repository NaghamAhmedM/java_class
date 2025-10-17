package com.sg.foundations.flowcontrol.whiles;
import java.util.*;

public class LazyTeenager {
    public static void main(String[] args){
        Random rGen = new Random();

        int cleaningChance = 0;
        int chanceCheck;
        boolean isRoomClean = false;
        int timesTold = 0;

        do{
            timesTold ++;
            System.out.println("Clean your room!! " + "(x" + timesTold + ")");

            cleaningChance = timesTold * 10;
            chanceCheck = rGen.nextInt(100);

            if(cleaningChance > chanceCheck){
                System.out.println("Fine! I'll Clean My Room. But I Refuse to Eat Peas!");
                isRoomClean = true;
                break;
            }
            if(timesTold > 6){
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        }while(!isRoomClean);
    }
}
