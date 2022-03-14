package com.careerdevs.thirty_days_of_coding

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
        Node travLeft, travRight;
        int leftBranchCount, rightBranchCount, branchRunLeft, branchRunRight;

        branchRunLeft = branchRunRight = leftBranchCount = rightBranchCount = 0;
        travLeft = travRight = root;

        boolean finished = false;
        int[] results = new int[2];

        do{
            
            if (travLeft.left != null){
                travLeft = travLeft.left;
                leftBranchCount++;
            }
            else if (travLeft.right != null){
                travLeft = travLeft.right;
                leftBranchCount++;
            }

            if (travRight.right != null){
                travRight = travRight.right;
                rightBranchCount++;
            }
            else if (travRight.left != null){
                travRight = travRight.left;
                rightBranchCount++;
            }

            if (travLeft.left == null && travLeft.right == null){
                results[0] = leftBranchCount;
                branchRunLeft = 1;
            }

            if (travRight.left == null && travRight.right == null){
                results[1] = rightBranchCount;
                branchRunRight = 1;
            }

            if (branchRunLeft == 1 && branchRunRight == 1)
                finished = true;

        } while (!finished);

        if (results[0] > results[1])
            return results[0];
        
        return results[1];
    }

    public static Node insert(Node root,int data){