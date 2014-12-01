package euler;

public class problem_014 {
	public static void main(String[] args) {
		long[] length = new long[1000000];
		length[0] = 0;
		length[1] = 1;
		int start = 1;
		long maxlen = 1;
		int i = 2;
		for (i = 2; i < 1000000; ++i) {
			long current = i;
			while (true) {
				if (current < 1000000 && length[(int)current] != 0) {
					length[i] = length[i] + length[(int)current];
					break;
				}
				if (current % 2 == 0) {
					current = current / 2;
				} else {
					current = current * 3 + 1;
				}
				length[i]++;
			}
			if (length[i] > maxlen) {
				maxlen = length[i];
				start = i;
			}
		}
		System.out.println(start);
	}
}
