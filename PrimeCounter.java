// Q : 15

package com.jigul.secday_logical;

public class PrimeCounter {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int[] numbers) throws Exception {
        if (numbers == null) {
            throw new NullPointerException("The input array is null.");
        }

        int primeCount = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        PrimeCounter primeCounter = new PrimeCounter();

        try {
            int primeCount = primeCounter.countPrimes(numbers);

            System.out.println(" prime elements: " + primeCount);
        } catch (NullPointerException e) {
            System.out.println( e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


