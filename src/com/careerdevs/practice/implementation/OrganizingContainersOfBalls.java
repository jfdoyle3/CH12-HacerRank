package com.careerdevs.practice.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrganizingContainersOfBalls {

    public static String OrganizingContainers(List<List<Integer>> container) {
        String solution = "Possible";

        List<Integer> bins = new ArrayList<>();
        List<Integer> balls = new ArrayList<>();
        int rowTotal = 0;
        int colTotal = 0;
        int rowLen = container.get(0).size();
        int colLen = container.size();

        do {
            for (int row = 0; row < rowLen; row++)
                rowTotal += container.get(colLen - 1).get(row);

            bins.add(rowTotal);
            rowTotal = 0;
            colLen--;
        } while (colLen > 0);

        do {
            for (int col = 0; col < container.size(); col++)
                colTotal += container.get(col).get(rowLen - 1);

            balls.add(colTotal);
            colTotal = 0;
            rowLen--;
        } while (rowLen > 0);

        Collections.sort(balls);
        Collections.sort(bins);

        if (!bins.equals(balls))
            solution = "Impossible";

        return solution;
    }

    public static void main(String[] args) {


    }
}


