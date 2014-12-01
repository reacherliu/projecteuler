public class Problem050 {
	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
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
		int[] primes = new int[1000000];
		int i = 2;
		int index = 0;
		for (i = 2; i < 1000000; ++i) {
			if (isPrime(i)) {
				primes[index++] = i;
			}
		}
		System.out.println(index);
		int j = 0;
		int len = index;
		boolean found = false;
		for (len = index; !found && len > 1; --len) {
			// The sequence starts from primes[j].
			for (j = 0; j + len - 1 < index; ++j) {
				if (j == 0 && len % 2 != 0) {
					continue;
				}
				if (j != 0 && len % 2 == 0) {
					continue;
				}
				int sum = 0;
				for(i = 0; i < len; ++i) {
					sum = sum + primes[j + i];
					if (sum > 1000000) {
						break;
					}
				}
				if (sum < 1000000 && isPrime(sum)) {
					System.out.println(sum);
					found = true;
					break;
				}
			}
		}
	}
}

