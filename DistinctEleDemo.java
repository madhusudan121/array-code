//Q : 16

package com.jigul.secday_logical;
import java.util.ArrayList;

class DistinctCounter {
    private int[] numbers;

    public DistinctCounter(int[] numbers) {
        this.numbers = numbers;
    }

    public void countAndPrintDistinctElements() {
        try {
            if (numbers == null) {
                throw new NullPointerException("The input array is null.");
            }

            ArrayList<Integer> distinctElements = new ArrayList<>();
            int distinctCount = 0;

            for (int i = 0; i < numbers.length; i++) {
                boolean isDistinct = true;
                for (int j = 0; j < numbers.length; j++) {
                    if (i != j && numbers[i] == numbers[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct && !distinctElements.contains(numbers[i])) {
                    distinctElements.add(numbers[i]);
                    distinctCount++;
                }
            }

            System.out.println("Number of distinct elements: " + distinctCount);
            System.out.println("Distinct elements: " + distinctElements);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}

public class DistinctEleDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        DistinctCounter counter = new DistinctCounter(numbers);
        counter.countAndPrintDistinctElements();
    }
}