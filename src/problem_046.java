package euler;

public class problem_046 {
	private static boolean isPrime(int n) {
		int limit = (int) Math.sqrt((double) n);
		int i = 0;
		for (i = 2; i <= limit; ++i) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isComposible(int n) {
		if (n % 2 == 0) {
			return false;
		}
		int limit = (int) Math.sqrt((double) n / 2);
		int i = 0;
		for (i = 1; i <= limit; ++i) {
			if (isPrime(n - 2 * i * i)) {
				System.out.println(n + " " + i);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n = 3;
		while (true) {
			if (isPrime(n)) {
				n = n + 2;
			} else {
				if (!isComposible(n)) {
					break;
				}
				n = n + 2;
			}
		}
		System.out.println(n);
	}
}
