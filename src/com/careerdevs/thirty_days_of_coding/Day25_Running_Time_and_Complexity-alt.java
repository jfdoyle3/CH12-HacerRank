package com.careerdevs.thirty_days_of_coding

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       // Initialize Scanner for input
        Scanner input=new Scanner(System.in);
        
        // Input number of test cases
        int testCases=input.nextInt();
        
        //Loop through number of test cases
        for(int num=0; num<testCases; num++){
            
            // input test case numbers
            int testNum=input.nextInt();
            
            // Run check on method checkForPrime to determine prime or not
            String isPrime=(checkForPrime(testNum)) ? "Prime" : "Not prime";
            
            // output Prime or Not prime
            System.out.println(isPrime);
            }
        }
        static boolean checkForPrime(double number){
            // Return true for Prime numbers
            if(number==2 || number==3 || number==5 || number==7)
                return true;
            // 1 is not prime return false
            if(number==1)
                return false;
           // for (int i = 0; i < 5; i++) {
			// take the square root of number
			//double sqrtNum = Math.sqrt(number);
			//number = sqrtNum;
			//System.out.println("sqr:  " + number);
			//if(number==3)
			//	System.out.println("Not prime");
			//else
			//	System.out.println("Prime");
				
		}
            // looping
            while(true){
             
                // take the square root of number
            double sqrtNum=Math.sqrt(number);
            number=sqrtNum;    
                System.out.println("sqr:  "+number);

if (number==2 || number==3 || number==5 || number==7)
                return true;
            else
                break;
            }
            
           return false;
        }
    }

  h