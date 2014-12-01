package euler;

public class problem_036 {
	private static boolean isPal(String s) {
		int len = s.length();
		int i = 0;
		for (i = 0; i < len / 2; ++i) {
			if(s.charAt(i) != s.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for (i = 1; i < 1000000; ++i) {
			if (isPal(Integer.toString(i)) && isPal(Integer.toBinaryString(i))) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
