package com.careerdevs.practice.implementation;

public class RepeatedString {

    public static void main(String[] args) {


        String passed="\033[1;32m";
        String failed="\033[1;31m";
        String reset="\033[0m";
        String s="aab";
        long n=882787;
        // Expected
        long results=588525;

        // --------------------------------
        System.out.println(">=====< Debug Console >=====<");
        int strLen=s.length();
        long total=n-strLen;
        if(strLen==1){
            total=n;
        }

        System.out.println("strLen: "+strLen);

        System.out.println("\n\n>=====< Results >=====<");
        System.out.println(results==total ? passed+"Passed"+reset : failed+"Failed"+reset);
        System.out.println("expected: "+results);
        System.out.println("results: "+total);



    }
}
