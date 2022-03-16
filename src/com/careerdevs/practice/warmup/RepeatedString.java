package com.careerdevs.practice.warmup;

public class RepeatedString {


    private static String passed="\033[1;32m";
    private static String failed="\033[1;31m";
    private static String reset="\033[0m";

    public static void main(String[] args) {

        long aCounter=0;
        long junk=0;
        String s="aab";
        int strLen=s.length();
        String[] aCount=s.split("");
        for (String a : aCount) {
            if (a.equals("a"))
                aCounter++;
            else
                junk++;
        }

        long n=882787;
        // Expected
        long results=588525;

        // --------------------------------
        System.out.println(">=====< Debug Console >=====<");

        //long total=n-strLen;
        long total=Math.round(n/((double)strLen%n/aCounter));
        if(strLen==1){
            total=n;
        }


        System.out.println("j:"+junk);
        System.out.println("a: "+aCounter);
        System.out.println(strLen+" % "+n+"= "+(double)(strLen%n)/2);
        System.out.println("r: "+Math.round(n/((double)strLen%n/2)));


        System.out.println("\n\n>=====< Results >=====<");
        System.out.println(results==total ? passed+"Passed"+reset : failed+"Failed"+reset);
        System.out.println("expected: "+results);
        System.out.println("results: "+total);



    }
}
