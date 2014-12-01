package euler;

public class problem_027 {
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
		int maxa = 0;
		int maxb = 0;
		int max = 0;
		int cura = 0;
		int curb = 0;
		int cur = 0;
		for (curb = -999; curb < 1000; ++curb) {
			for (cura = -999; cura < 1000; ++cura) {
				cur = 0;
				int temp = curb;
				while (temp > 1 && isPrime(temp)) {
					temp = temp + 2 * cur + 1 + cura;
					cur++;
				}
				if (cur > max) {
					max = cur;
					maxa = cura;
					maxb = curb;
					System.out.println(max);
				}
			}
		}
		System.out.println(max + " " + maxa + " " + maxb);
		System.out.println(maxa * maxb);
	}
}
