package com.company;

import java.util.Scanner;

public class Transfer {

    public static int[] read() {
        // input and split to String array
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
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


    public static int[] ArrayChange(int[] arr ){


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

        return temp;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }



}
