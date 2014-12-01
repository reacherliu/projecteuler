package euler;

public class problem_038 {
	private static long Concatenate(int a, int n) {
		boolean[] used = new boolean[10];
		used[0] = true;
		int i = 0;
		String result = "";
		for (i = 1; i <= n; ++i) {
			int temp = a * i;
			String tempstr = Integer.toString(temp);
			int j = 0;
			for (j = 0; j < tempstr.length(); ++j) {
				if (used[tempstr.charAt(j) - '0']) {
					return -1;
				}
				used[tempstr.charAt(j) - '0'] = true;
			}
			result = result + tempstr;
		}
		return Long.parseLong(result);
	}
	
	public static void main(String[] args) {
		long cur = Concatenate(9, 5);
		long max = cur;
		int a = 91;
		for (a = 9000; a < 9999; ++a) {
			cur = Concatenate(a, 2);
			if (cur > max) {
				max = cur;
			}
		}
		System.out.println(max);
	}
}
