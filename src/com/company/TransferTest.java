package com.company;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TransferTest {

    @org.junit.jupiter.api.Test
    void read() {
        String s1 = "2 3 4 5 6 7 8";
        int[] arrExpected1 = {2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(arrExpected1, Transfer.read(s1));

        String s2 = "-1 3 4 5 6 7 8";
        int[] arrExpected2 = {0, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(arrExpected2, Transfer.read(s2));

        String s3 = "2  3      4 5 6      7 8";
        int[] arrExpected3 = {2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(arrExpected3, Transfer.read(s3));

        String s4 = "2 br 4 5 6 7 8";
        int[] arrExpected4 = {2,0,4,5,6,7,8};
        assertArrayEquals(arrExpected4, Transfer.read(s4));
    }

    @org.junit.jupiter.api.Test
    void arrayChange() {
        int[] arr1 = {2, 3, 4, 1, 6, 10};
        String str1 = "4161023";
        int[] arrExpected1 = {4, 1, 6, 10, 2, 3};
        assertEquals(str1, Transfer.ArrayChange(arr1));

        int[] arr2 = {3, 2, 1, 6};
        String str2 = "6321";
        int[] arrExpected2 = {6, 3, 2, 1};
        assertEquals(str2, Transfer.ArrayChange(arr2));


        int[] arr3 = {4, 3, 4, 3, 1, 2};
        String str3= "124343";
        int[] arrExpected3 = {1, 2, 4, 3, 4, 3};
        assertEquals(str3, Transfer.ArrayChange(arr3));

    }

    @org.junit.jupiter.api.Test
    void isNumeric() {
        String one = "1";
        assertEquals(true, Transfer.isNumeric(one));

        String two = "two";
        assertEquals(false, Transfer.isNumeric(two));


    }
}