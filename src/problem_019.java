package euler;

public class problem_019 {
	private static int []DAYSINMONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static boolean isLeap (int year) {
		if (year % 400 == 0) {
			return true;
		}
		if (year % 100 == 0) {
			return false;
		}
		if (year % 4 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int count = 0;
		int start = isLeap(1900) ? 366 : 365;
		start = start % 7;
		int i = 0;
		for (i = 0; i < 1200; ++i) {
			if (start == 6) {
				count++;
			}
			start = start + DAYSINMONTH[i % 12];
			if (i % 12 == 1 && isLeap(1900 + i / 12 + 1)) {
				start++;
			}
			start = start % 7;
		}
		System.out.println(count);
	}
}
