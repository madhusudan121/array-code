//Q : 19
package com.jigul.secday_logical;
import java.util.Scanner;

public class SearchArray {

    private int[] numbers;

    public SearchArray(int[] numbers) {
        this.numbers = numbers;
    }

    public void searchElement(int element) {
        try {
            if (numbers == null) {
                throw new NullPointerException("The array is not initialized.");
            }

            boolean isFound = false;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == element) {
                    System.out.println("Element found at index: " + i);
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("Element not found");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array elements separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        try {
            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in input.");
            return ;
        }

        SearchArray arraySearch = new SearchArray(numbers);

        System.out.println("Enter the element to search:");
        int element = scanner.nextInt();

        arraySearch.searchElement(element);

        scanner.close();
    }
}
