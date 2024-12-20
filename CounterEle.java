//Q : 14

package com.jigul.secday_logical;
import java.util.HashMap;
import java.util.Map;
public class CounterEle {
	public int countElements(int[] array, int k) throws Exception {
        if (array == null) {
            throw new NullPointerException("The input array is null.");
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (int value : frequencyMap.values()) {
            if (value == k) {
                count++;
            }
        }

        return count;
    }
	public static void main(String[] args) {
		int[] numbers = {1, 2, 2, 3, 4, 4, 5, 5};
        int k = 2;
        CounterEle counter = new CounterEle();

        try {
            int result = counter.countElements(numbers, k);

            if (result > 0) {
                System.out.println("Number of elements  " + k + " times: " + result);
            } else {
                System.out.println("No element found  " + k + " times.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

}
