//Q : 11

package com.jigul.secday_logical;

 class CountOddEven {
	
	private int[] num;
	
	public CountOddEven(int[] num) {
		this.num = num;
	}
	
	public void countOddEven() {
		try {
			if(num == null) {
				throw new NullPointerException("The input array is null:");
			}
			int oddCount = 0;
			int evenCount = 0;
			
			for(int number : num) {
				if(number%2 == 0) {
					evenCount ++;
				}
				else {
					oddCount++;
				}
				
			}
			System.out.println("Number of even ele : "+ evenCount);
			System.out.println("Number of odd ele : "+ oddCount);

		}
		catch(NullPointerException e){
			System.out.println("Error: " + e.getMessage());
		}
		 catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        }
	}
}
 
 
public class CountEvenOdd {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		CountOddEven count = new CountOddEven(num);
		
		count.countOddEven();
		
	}
}