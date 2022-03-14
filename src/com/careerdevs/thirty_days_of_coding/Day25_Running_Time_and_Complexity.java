package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int number=input.nextInt();
        for (int idx=0; idx<number; idx++){
            int count=0;
            int testNumber=input.nextInt();
            for (int idx2=2; idx2<=testNumber; idx2++){
                int result=testNumber%idx2;
                if(result==0){
                    count++;
                }
             
            } 
            if (count==1){
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
         
        }

    }

}