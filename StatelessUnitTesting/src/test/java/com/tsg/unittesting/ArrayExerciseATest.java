package com.tsg.unittesting;

import com.tsg.unittesting.arrays.ArrayExerciseA;
import org.junit.jupiter.api.Test;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseATest {

    /* Test Plan:
     ** maxOfArray({5}) --> 5
     ** maxOfArray({2, 3, 7}) --> 7
     ** maxOfArray({-900, -100, 0}) --> 0
     */

    public ArrayExerciseATest(){

    }

    @Test
    public void testSingleElementArray(){

        int[] array = {5};

        int result = maxOfArray(array);

        assertEquals(5, result, "Single element array should return the element itself.");
    }

    @Test
    public void testNormalArray(){

        int[] array = {2, 3, 7};

        int result = maxOfArray(array);

        assertEquals(7, result, "Normal array should return the largest number in the array.");
    }

    @Test
    public void testNegativeArray(){

        int[] array = {-900, -100, 0};

        int result = maxOfArray(array);

        assertEquals(0, result, "Negative numbers in array should return the largest number correctly.");
    }

}