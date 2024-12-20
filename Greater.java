// Q : 12

package com.jigul.secday_logical;

class CountGreater {
	private int[] num;
	
	public CountGreater(int[] num) {
		this.num = num;
	}
	
	public int countGreaterAvg() throws Exception {
		if(num == null || num.length == 0) {
			throw new Exception("Array is nuu..");
		}
		
		 int sum = 0;
	        for (int number : num) {
	            sum += number;
	        }

	        double average = (double) sum / num.length;
	        
	        int count = 0;
	        for (int number : num) {
	            if (number > average) {
	                count++;
	            }
	        }
	        return count;
	}
}



public class Greater {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};

        try {
        	CountGreater analysis = new CountGreater(numbers);
            int count = analysis.countGreaterAvg();
            System.out.println("Greater ele are : " + count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		

	}

}
