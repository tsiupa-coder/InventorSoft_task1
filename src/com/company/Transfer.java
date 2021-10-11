package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Transfer {

    public static int[] read(String line) {
        // split to String array
        String str = line;
        str = str.trim().replaceAll(" +", " ");
        String[] splited = str.split(" ");

        //String array -> int Array
        int[] ints = new int[splited.length];
        for (int i = 0; i < splited.length; i++) {
            if (isNumeric(splited[i])) {
                int t = Integer.parseInt(splited[i]);
                if (t > 0) ints[i] = t;

            }
        }

        return ints;
    }


    public static String ArrayChange(int[] arr ){


        int[] temp = new int[arr.length];
        int t = 0;
        for (int i = arr[0]; i < arr.length; i++){
            temp[t] = arr[i];
            t++;

        }
        for(int i = 0; i < arr[0]; i++){
            temp[t] = arr[i];
            t++;
        }

        return toString(temp);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static String toString(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();

        for ( int i : arr ) {
            stringBuilder.append(i);
        }

        return stringBuilder.toString();
    }



}
