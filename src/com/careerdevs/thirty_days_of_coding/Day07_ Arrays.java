package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void reverseArray(int[] array){
        int[] arrReverse=new int[array.length];
        for (int idxForward=0, idxReverse=array.length-1; idxForward<array.length; idxForward++,idxReverse--){
           arrReverse[idxReverse]=array[idxForward];
        }
        for (int number : arrReverse)
          System.out.print(number+" ");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
 
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        reverseArray(arr);
        scanner.close();
    }
}
