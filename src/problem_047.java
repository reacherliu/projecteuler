package euler;

import java.util.HashMap;

public class problem_047 {
	private static HashMap<Integer, Boolean> primeMap = new HashMap<Integer, Boolean>();
	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		int limit = (int) Math.sqrt((double) n);
		int i = 2;
		for (i = 2; i <= limit; ++i) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean hasFourPrimeFactors(int n) {
		int count = 0;
		int i = 2;
		while (n != 1) {
			if (!primeMap.containsKey(i)) {
				primeMap.put(i, isPrime(i));
			}
			if (primeMap.get(i)) {
				if (n % i == 0) {
					count++;
					while (n % i == 0) {
						n = n / i;
					}
				}
			}
			i++;
		}
//		System.out.println(count);
		return count == 4;
	}
	
	public static void main(String[] args) {
		int n = 644;
		boolean found = false;
		while (!found) {
			if (!hasFourPrimeFactors(n)){
				n = n + 1;
			} else if(!hasFourPrimeFactors(n+1)) {
				n = n + 2;
			} else if(!hasFourPrimeFactors(n+2)) {
				n = n + 3;
			} else if (!hasFourPrimeFactors(n+3)) {
				n = n + 4;
			} else {
				found = true;
			}
//			System.out.println(n);
		}
		System.out.println(n);
	}
}
