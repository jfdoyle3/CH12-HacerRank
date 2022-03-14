package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void checkForWeirdness(int number){
            if (number % 2 != 0)
                System.out.println("Weird");
            else if (number <= 5)
                System.out.println("Not Weird");
            else if (number <= 20)
                System.out.println("Weird");
            else if (number > 20)
                System.out.println("Not Weird");
            
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        checkForWeirdness(N);

        scanner.close();
    }
}

