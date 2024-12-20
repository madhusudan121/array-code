//Q : 17

package com.jigul.secday_logical;
import java.util.ArrayList;
import java.util.List;

public class Duplicate {
    private int[] numbers;

    public Duplicate(int[] numbers) {
        this.numbers = numbers;
    }

    public void countAndPrintDuplicates() {
        try {
            if (numbers == null) {
                throw new NullPointerException("The input array is null.");
            }

            List<Integer> duplicates = new ArrayList<>();
            int duplicateCount = 0;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j] && !duplicates.contains(numbers[i])) {
                        duplicates.add(numbers[i]);
                        duplicateCount++;
                        break;
                    }
                }
            }
            System.out.println("Number of duplicate elements: " + duplicateCount);
            System.out.println("Duplicate elements: " + duplicates);

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        Duplicate duplicateCounter = new Duplicate(numbers);
        duplicateCounter.countAndPrintDuplicates();
    }
}
