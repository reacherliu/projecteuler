package euler;

public class problem_114 {
	public static void main(String[] args) {
		long[] a = new long[51]; // a[n]: the nth block is red.
		long[] b = new long[51]; // b[n]: the nth block is black.
		a[0] = 0;
		a[1] = 0;
		a[2] = 0;
		a[3] = 1;
		b[0] = 0;
		b[1] = 1;
		b[2] = 1;
		b[3] = 1;
		for(int i = 4; i < 51; ++i) {
			b[i] = b[i-1] + a[i-1]; // The i-1 block is either red or black, the i block is black.
			// The (i-3), (i-4),..,0 block is black.
			for (int j = 0; j <= i-3; ++j) {
				a[i] = a[i] + b[j];
			}
			// All blocks are red.
			a[i] = a[i] + 1;
		}
		System.out.println(a[50] + b[50]);
	}
}
