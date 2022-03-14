package com.careerdevs.thirty_days_of_coding;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

         static void binaryNumbers(int baseTen){

            List<Integer> binaryNum = new ArrayList<>();
            int counter=0;
             int total = 0;
             List<Integer> count = new ArrayList<>();

             while (baseTen>0){
                int quotient = baseTen /2;
                int remainder = baseTen % 2;
                baseTen = quotient;
                binaryNum.add(remainder);
            } 
            Collections.reverse(binaryNum);

            for (int index = 0; index < binaryNum.size(); index++)
            {
                if (binaryNum.get(index) == 1)
                {
                    counter++;
                    total = counter;
                    count.add(total);
                }
                else
                    counter  = 0;
            }
            Collections.sort(count);
            Collections.reverse(count);
            System.out.print(count.get(0));
        }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         binaryNumbers(n);
        scanner.close();
    }
}
