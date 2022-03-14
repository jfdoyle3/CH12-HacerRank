package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int bitwiseAnd(int n, int k) {
        int[] sequence = new int[n];
        HashMap<Integer,Integer> bitMap=new HashMap<>();
        for (int seq = 0; seq < sequence.length; seq++) {
            sequence[seq] = seq + 1;
        }
        int seqLength = sequence.length;
        for (int idx = 0; idx < n; idx++) {
            for (int idx2 = idx + 1; idx2 < n; idx2++) {
                int a = sequence[idx];
                int b = sequence[idx2];

                int bit = (a & b);
            //    System.out.printf("A= %d & B= %d; A&B= %d\n",a, b, bit);
                 if(bitMap.containsKey(bit)){
                        bitMap.put(bit,bitMap.get(bit)+1);
                    } else{
                        bitMap.put(bit,1);
                    }
                }
            
        }
       // System.out.println(bitMap.toString());
        int results=findHighestNumber(bitMap);
            return results;
    }
    
    static int findHighestNumber(HashMap<Integer,Integer> hm){
       // refactor this
        List<Integer> getHighestKey=new ArrayList<Integer>();
        if(hm.size()>1)
            hm.remove(0);
       for (Integer value : hm.values())
       System.out.println("v: "+value);
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
                if(entry.getValue()==Collections.max(hm.values()))
                  getHighestKey.add(entry.getKey()); 
        }
         Collections.sort(getHighestKey);
                  Collections.reverse(getHighestKey);
                  System.out.println("highest: "+getHighestKey.get(0));
            return getHighestKey.get(0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            int countBits=bitwiseAnd(n,k);
            System.out.println(countBits);
            
        }

        scanner.close();
    }
}
