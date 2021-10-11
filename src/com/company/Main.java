package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        System.out.println(Transfer.ArrayChange(Transfer.read(line)));

        }
}
