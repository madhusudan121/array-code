//Q : 21

package com.jigul.secday_logical;

public class IndexPrinter {

    public void findEvenAndOddPositionElement(int[] numbers) {
        try {
            if (numbers == null) {
                throw new NullPointerException("The input array is null.");
            }

            System.out.println("Elements at even indices:");
            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 == 0) { 
                    System.out.print(numbers[i] + " ");
                }
            }

            System.out.println("\nElements at odd indices:");
            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 != 0) { 
                    System.out.print(numbers[i] + " ");
                }
            }

            System.out.println();

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50, 60};

        IndexPrinter printer = new IndexPrinter();
        printer.findEvenAndOddPositionElement(numbers);
    }
}

