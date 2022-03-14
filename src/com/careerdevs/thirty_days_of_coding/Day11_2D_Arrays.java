package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void problem(int[][] arr){
            int top = 0;
            int middle = 0;
            int bottom = 0;
            int counter = 0;
            List<Integer> counts = new ArrayList<Integer>();

            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                    middle = arr[i + 1][j + 1];
                    bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    counter = top + middle + bottom;
                    counts.add(counter);
                }
            }
            Collections.sort(counts);
            Collections.reverse(counts);

            System.out.printf("%d", counts.get(0));

        }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        problem(arr);
        scanner.close();
    }
}
