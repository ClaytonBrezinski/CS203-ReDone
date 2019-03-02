package CS203;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[][] inputMatrix = new double[][]{
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.30, 0.12, 0.4}};
        double[][] sortedMatrix = sortColumns(inputMatrix);
        print(sortedMatrix);
    }

    public static double[][] sortColumns(double[][] m) {
//        for (int i = 0; i < m.length; i++) {
//            // passes by reference
//            Arrays.sort(m[i]);
//        }
        for (double[] arrayRow : m) {
            // passes by reference
            Arrays.sort(arrayRow);
        }
        return m;
    }
    public static void print(double[][] inputArray){
        for(double[] arrayRow: inputArray){
            for (double element: arrayRow){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}