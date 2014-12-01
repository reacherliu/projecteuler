package euler;

public class problem_117 {
	public static void main(String[] args) {
		long[] num = new long[51];
		num[1] = 1; // 1
		num[2] = 2; // 1+1, 2
		num[3] = 4; // 1+1+1, 1+2, 2+1, 3
		num[4] = 8; // 1+1+1+1, 1+2+1, 2+1+1, 3+1, 1+1+2, 2+2, 1+3, 4 
		for (int i = 5; i <= 50; ++i) {
			num[i] = num[i - 1] + num[i - 2] + num[i - 3] + num[i - 4];
		}
		System.out.println(num[50]);
	}
}
