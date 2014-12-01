package euler;

import java.math.BigInteger;

public class problem_057 {	
	public static void main(String[] args) {
		BigInteger[] nominators = new BigInteger[1000];
		BigInteger[] denominators = new BigInteger[1000];
		nominators[0] = BigInteger.ONE;
		denominators[0] = BigInteger.valueOf(2);
		int count = 0;
		int i = 0;
		for (i = 1; i < 1000; ++i) {
			nominators[i] = denominators[i - 1];
			denominators[i] = denominators[i - 1].multiply(BigInteger.valueOf(2)).add(nominators[i - 1]);
			if (nominators[i].add(denominators[i]).toString().length() 
					> denominators[i].toString().length()) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
