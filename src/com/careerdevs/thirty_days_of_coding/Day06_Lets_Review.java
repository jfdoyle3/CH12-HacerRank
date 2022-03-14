package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.util.*;

public class Solution {
 private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         int n = input.nextInt();
         
            for (int index = 0; index < n; index++)
            {
                
               String  word = input.next();
               String[]  wordArr=word.split("");
                for (int even = 0; even < wordArr.length; even++)
                {
                    if (even % 2 == 0)
                        System.out.print(wordArr[even]);
                }

                System.out.print(" ");

                for (int odd = 0; odd < wordArr.length; odd++)
                {
                    if (odd % 2 != 0)
                        System.out.print(wordArr[odd]);
                }

                System.out.println();
        }
    }
}
