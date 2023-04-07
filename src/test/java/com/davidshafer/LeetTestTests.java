package com.davidshafer;

import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LeetTestTests {

    @Test
    public void Exercise01_Two_Sum(){
        LeetTest exercise = new LeetTest();
        //First and last with middle
        assertArrayEquals(new int[] {0, 2}, exercise.twoSum(new int[] {3, 2, 3}, 6));
        //First and middle
        assertArrayEquals(new int[] {0, 2}, exercise.twoSum(new int[] {2, 11, 7, 15}, 9));
        //Middle and last
        assertArrayEquals(new int[] {1, 2}, exercise.twoSum(new int[] {3, 2, 4}, 6));
        //First and last with nothing between
        assertArrayEquals(new int[] {0, 1}, exercise.twoSum(new int[] {3, 3}, 6));
    }


}
