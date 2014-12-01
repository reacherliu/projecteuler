package euler;

public class problem_040 {
	private static long[] nums = new long[7];
	private static int findDigit(long index) {
		int i = 0;
		long base = 1;
		for (i = 1; i < 7; ++i) {
			if (index < nums[i]) {
				int tempi = (int) (index / i);
				long temp = base + tempi;
				int tempm = (int) index % i;
				if (tempm != 0) {
					return Long.toString(temp).charAt(tempm-1) - '0';
				} else {
					temp = temp - 1;
					String tempstr = Long.toString(temp);
					return tempstr.charAt(tempstr.length()-1) - '0';
				}
			}
			index = index - nums[i];
			base = base * 10;
		}
		return -1;
	}
	public static void main(String[] args) {
		int i = 0;
		nums[i] = 1;
		int digitsNum = 1;
		int power = 9;
		for (i = 1; i < 7; ++i) {
			nums[i] = power * digitsNum; 
			digitsNum++;
			power = power * 10;
			System.out.println(nums[i]);
		}
		System.out.println("=============");
		System.out.println(findDigit(10));
		System.out.println(findDigit(100));
		System.out.println(findDigit(1000));
		System.out.println(findDigit(10000));
		System.out.println(findDigit(100000));
		System.out.println(findDigit(1000000));
	}
}
