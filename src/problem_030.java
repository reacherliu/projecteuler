package euler;

public class problem_030 {
	private static boolean check(int n) {
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			sum = (int) (sum + Math.pow((double)temp % 10, 5.0));
			temp = temp / 10;
		}
		return (sum == n);
	}
	
	public static void main(String[] args) {
		int i = 10;
		int sum = 0;
		// 354294 = 6 * (9^5)
		for (i = 10; i <= 354294; ++i) {
			if (check(i)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
