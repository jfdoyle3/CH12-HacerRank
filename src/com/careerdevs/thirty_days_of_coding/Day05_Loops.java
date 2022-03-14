package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void timesTable(int number){
        for (int index = 1; index <= 10; index++)
            {
                int total = number * index;
                System.out.printf("%d x %d = %d\n", number, index, total);
            }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         timesTable(n);
        scanner.close();
    }
}
