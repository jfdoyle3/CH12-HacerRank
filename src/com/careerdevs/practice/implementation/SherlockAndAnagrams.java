package com.careerdevs.practice.implementation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {

        int counter=0;

        HashMap<String,Integer> decode=new HashMap<>();
        String[] stringArr=s.split("");
        for (int idx=0; idx<stringArr.length; idx++){
            if(!decode.containsKey(stringArr[idx]))
                decode.put(stringArr[idx],0);
            decode.put(stringArr[idx],decode.get(stringArr[idx])+1);
        }

        for(Map.Entry<String,Integer> entry : decode.entrySet()){
            if (entry.getValue()%2==0)
                counter++;

        }
        // if(counter==decode.size())
        //     return counter;
        System.out.printf("Counter: %d  |  Map: %s\n",counter, decode);
        return 99;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}