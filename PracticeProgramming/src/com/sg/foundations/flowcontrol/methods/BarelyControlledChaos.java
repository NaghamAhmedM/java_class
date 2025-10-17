package com.sg.foundations.flowcontrol.methods;
import java.util.*;

public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = choosesRandomColor(); // call color method here
        String animal = choosesRandomAnimal(); // call animal method again here
        String colorAgain = choosesRandomColor(); // call color method again here
        int weight = choosesRandomInteger(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = choosesRandomInteger(10, 20); // call number method,
        // with a range between 10 - 20
        int number = choosesRandomInteger(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = choosesRandomInteger(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String choosesRandomAnimal(){
        Random rGen= new Random();

        String[] animalArray ={"Cat", "Dog", "Zebra", "Donkey", "Snake"};
        int randomIndex = rGen.nextInt(animalArray.length);

        return animalArray[randomIndex];
    }

    public static String choosesRandomColor(){
        Random rGen= new Random();

        String[] colorArray ={"Red", "Black", "Brown", "Magenta", "Orange"};
        int randomIndex = rGen.nextInt(colorArray.length);

        return colorArray[randomIndex];
    }

    public static int choosesRandomInteger(int min, int max){
        Random rGen= new Random();

        return rGen.nextInt(max - min + 1) + min;
    }
}
