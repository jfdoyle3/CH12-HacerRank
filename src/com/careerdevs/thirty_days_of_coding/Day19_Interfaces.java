package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
  
   public int divisorSum(int number){
       int tally = 0;
       for (int idx = 1; idx <= number; idx++)
       {
           int div = number % idx;
           if (div == 0)
           {
               tally += idx;
           }
       }

       return tally;
   }

}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}