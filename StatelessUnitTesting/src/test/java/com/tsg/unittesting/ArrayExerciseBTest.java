package com.tsg.unittesting;

import org.junit.jupiter.api.Test;

import static com.tsg.unittesting.arrays.ArrayExerciseB.multiplyAll;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseBTest {

    /* Test Plan:
     * multiplyAll( 5 , [ 1 , 2 , 3 , 4 , 5 ] ) ->  [ 5 , 10 , 15 , 20 , 25 ]
     * multiplyAll( 0 , [ 1, 1, 1, 1, 1, 1, 1, 1, 10 ] ) ->  [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ]
     * multiplyAll( -1 , [ -2 , 0 , 0 , 1 ] ) ->  [ 2 , 0 , 0 , -1 ]
     */

    public ArrayExerciseBTest(){

    }

    @Test
    public void testPositiveArrayMultiplier(){

        int[] array = {1, 2, 3, 4, 5};
        int multiplier = 5;
        int[] expected = {5, 10, 15, 20, 25};

        int[] result = multiplyAll(multiplier, array);

        assertArrayEquals(expected, result, "Should multiply array by positive number normally");
    }

    @Test
    public void testZeroArrayMultiplier(){

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 10};
        int multiplier = 0;
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] result = multiplyAll(multiplier, array);

        assertArrayEquals(expected, result, "Should multiply array by Zero normally");
    }

    @Test
    public void testNegativeArrayMultiplier(){

        int[] array = {-2 , 0 , 0 , 1};
        int multiplier = -1;
        int[] expected = {2 , 0 , 0 , -1};

        int[] result = multiplyAll(multiplier, array);

        assertArrayEquals(expected, result, "Should multiply array by Negative numbers normally");
    }

}