package com.seg.enums;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the day of your choice:");
        String inputDay = scanner.nextLine().trim().toUpperCase();

        try {
            Enum1 day = Enum1.valueOf(inputDay); // converting string input into enum1 type
            int daysTillFriday = 0;

            switch (day){
                case SATURDAY -> {
                    daysTillFriday = 6;
                    break;
                }
                case SUNDAY -> {
                    daysTillFriday = 5;
                    break;
                }
                case MONDAY -> {
                    daysTillFriday = 4;
                    break;
                }
                case TUESDAY -> {
                    daysTillFriday = 3;
                    break;
                }
                case WEDNESDAY -> {
                    daysTillFriday = 2;
                    break;
                }
                case THURSDAY -> {
                    daysTillFriday = 1;
                    break;
                }
                case FRIDAY -> {
                    daysTillFriday = 0;
                    break;
                }
            }

            if(daysTillFriday == 0){
                System.out.println("Thank god its Friday!!!");
            }else{
                System.out.println("There are " + daysTillFriday + " day(s) till it is Friday!");
            }

        }catch (IllegalArgumentException e){
            System.out.println("Invalid day entered.");
        }

        scanner.close();

    }

}
