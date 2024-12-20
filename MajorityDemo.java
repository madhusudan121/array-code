//Q : 13

package com.jigul.secday_logical;
import java.util.HashMap;
public class MajorityDemo {
	public int findMajority(int[] arr) throws Exception {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array is null or empty."); 
		}
		 HashMap<Integer, Integer> elementCount = new HashMap<>();
	        int n = arr.length;
	        
	        for (int num : arr) {
	            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);

	            // Check if the current element is the majority element
	            if (elementCount.get(num) > n / 2) {
	                return num;
	            }
	        }
	        throw new Exception("No majority element found.");
	}



	public static void main(String[] args) {
		MajorityDemo finder = new MajorityDemo();
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        try {
            int majorityElement = finder.findMajority(arr);
            System.out.println("The majority element is: " + majorityElement);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

}
