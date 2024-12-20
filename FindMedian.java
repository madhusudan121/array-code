//Q : 20

package com.jigul.secday_logical;

import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Array size must be greater than zero.");
            }

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            FindMedian finder = new FindMedian();

            double median = finder.findMedian(array);
            System.out.println("Median is: " + median);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public double findMedian(int[] sortedArray) {
        int length = sortedArray.length;

        if (length % 2 == 0) {
            return (sortedArray[length / 2 - 1] + sortedArray[length / 2]) / 2.0;
        } else {
            return sortedArray[length / 2];
        }
    }
}

