package CS203;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        double[][] inputMatrix = new double[][]{
//                {0.15, 0.875, 0.375},
//                {0.55, 0.005, 0.225},
//                {0.30, 0.12, 0.4}};
        double[][] inputMatrix = getUserInfo();
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

    public static void print(double[][] inputArray) {
        for (double[] arrayRow : inputArray) {
            for (double element : arrayRow) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static double[][] getUserInfo() {
        double[][] twoDArray = new double[3][3];

        System.out.println("Please enter a 3x3 array, row by row, with a space in between each number. And Enter between rows");
        // Reading from System.in
        Scanner input = new Scanner(System.in);

        // loop through the array,
        for (double[] row : twoDArray) {
            String inputString = input.nextLine();
            String[] individualNumbers = inputString.split(" ");
            for (int i = 0; i < row.length; i++) {
                try {
                    row[i] = Double.parseDouble(individualNumbers[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Due to an incorrect input, we are setting that incorrect value to 1.0");
                    row[i] = 1.0;
                }
            }
        }
        return twoDArray;
    }
}