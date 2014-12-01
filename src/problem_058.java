package euler;

public class problem_058 {
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
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int dif = 2;
		int i = 0;
		int cur = 1;
		while (true) {
			for (i = 0; i < 4; ++i) {
				cur = cur + dif;
				if (isPrime(cur)) {
					a++;
				}
			}
			if (a * 10 < b) {
				break;
			}
			b = b + 4;
			dif = dif + 2;
		}
		System.out.println(b);
		System.out.println((b+1)/2);
	}
}
