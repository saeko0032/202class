/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CICCC-CIRAC
 */
public class SortDoublesWithOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arrayDouble = {1.1, 7.7, 3.3, 4.4, 5.5, 6.6, 2.2, 8.8, 9.9, 10.1, 11.11, 12.12, 13.13, 14.14, 15.15};

        System.out.println(" 1: sort by ascending other : sort by descending");

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        if (inputNum == 1) {
            sortAsc(arrayDouble);
        } else {
            sortDesc(arrayDouble);
        }

        System.out.println(Arrays.toString(arrayDouble));
    }

    public static double[] sortAsc(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double temp = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;
    }

    public static double[] sortDesc(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double temp = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;
    }
}
