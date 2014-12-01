package euler;

public class problem_112 {
	private static boolean isBouncy(long n) {
		if (n <= 100) {
			return false;
		}
		int d1 = (int) (n % 10);
		n = n / 10;
		int d2 = (int) (n % 10);
		int flag = 0;
		while (n > 0) {
			if (d1 > d2) {
				if (flag == 1) {
					return true;
				}
				flag = -1;
			} else if (d1 < d2) {
				if (flag == -1) {
					return true;
				}
				flag = 1;
			}
			d1 = d2;
			n = n / 10;
			d2 = (int) (n % 10);
		}
		return false;
	}
	public static void main(String[] args) {
		long i = 100;
		long count = 0;
		for (i = 101; ; ++i) {
			if (isBouncy(i)) {
				System.out.println(i);
				count++;
			}
			if (count * 100 == i * 99) {
				break;
			}
		}
		System.out.println(i);
	}
}
