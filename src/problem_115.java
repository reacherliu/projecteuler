package euler;

public class problem_115 {
	private static final int BOUND = 1000000;
	private static final int M = 50;
	public static void main(String[] args) {
		long[] a = new long[500]; // a[n]: the nth block is red.
		long[] b = new long[500]; // b[n]: the nth block is black.
		int i = 0;
		int j = 0;
		a[0] = 0;
		b[0] = 0;
		for (i = 1; i < M; ++i) {
			a[i] = 0;
			b[i] = 1;
		}
		a[M] = 1;
		b[M] = 1;
		i = M;
		while (a[i] + b[i] <= BOUND) {
			i++;
			b[i] = b[i-1] + a[i-1];
			for (j = 0; j <= i - M; ++j) {
				a[i] = a[i] + b[j];
			}
			a[i] = a[i] + 1;
		}
		System.out.println(i);
	}
}
