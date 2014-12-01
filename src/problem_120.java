package euler;

public class problem_120 {
	public static void main(String[] args) {
		int sum = 0;
		int a = 3;
		for (a = 3; a <= 1000; a++) {
			int max = 2;
			for (int n = 1; n < a*a; n = n + 2) {
				int temp = 2 * n * a;
				temp = temp % (a*a);
				if (temp > max) {
					max = temp;
				}
			}
			sum = sum + max;
		}
		System.out.println(sum);
	}
}
