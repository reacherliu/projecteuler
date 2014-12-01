package euler;

public class problem_052 {
	public static boolean check(int a) {
		int [] exist = new int[10];
		int temp = a;
		while (temp > 0) {
			exist[temp%10]++;
			temp = temp / 10;
		}
		for (int i = 2; i <= 6; i++) {
			temp = a * i;
			int[] newexist = new int[10];
			while (temp > 0) {
				newexist[temp%10]++;
				temp = temp / 10;
			}
			for (int j = 0; j < 10; ++j) {
				if (newexist[j] != exist[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int i = 100000;
		for (i = 100000; i < 1000000; ++i) {
			if (check(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
