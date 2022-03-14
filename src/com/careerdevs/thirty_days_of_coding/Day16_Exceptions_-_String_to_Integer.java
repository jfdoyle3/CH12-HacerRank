package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void stringToInteger(String string){
      try
       {
           int res = Integer.parseInt(string);
          System.out.println(res);

       }
       catch (Exception e)
       {
           System.out.println("Bad String");
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        stringToInteger(S);
    }
}