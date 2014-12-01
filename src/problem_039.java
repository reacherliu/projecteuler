package euler;

public class problem_039 {
	private static int SolutionNum (int n) {
		int a = 1;
		int b = 1;
		int c = 1;
		int count = 0;
		for (a = 1; a <= n / 3; ++a) {
			for (b = a; b < (n - a) / 2; ++b) {
				c = n - a - b;
				if (a * a + b * b == c * c) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int i = 1000;
		int max = -1;
		int n = -1;
		for (i = 1000; i > 1; --i) {
			int temp = SolutionNum(i);
			if (temp > max) {
				max = temp;
				n = i;
			}
		}
		System.out.println(max + " " + n);
	}
	
}
