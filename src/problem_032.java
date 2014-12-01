package euler;

import java.util.TreeSet;

public class problem_032 {
	public static boolean check(int a, int b) {
		boolean[] used = new boolean[10];
		used[0] = true;
		int c = a * b;
		while (a > 0) {
			if (used[a % 10]) {
				return false;
			}
			used[a % 10] = true;
			a = a / 10;
		}
		while (b > 0) {
			if (used[b % 10]) {
				return false;
			}
			used[b % 10] = true;
			b = b / 10;
		}
		while (c > 0) {
			if (used[c % 10]) {
				return false;
			}
			used[c % 10] = true;
			c = c / 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		int a = 0;
		int b = 0;
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (a = 12; a < 99; ++a) {
			for (b = 102; b <= 987; ++b) {
				if (check(a, b)) {
					int c = a * b;
					System.out.println(a + " " + b + " " + c);
					set.add(c);
				}
			}
		}
		for (a = 1; a < 10; ++a) {
			for (b = 1023; b <= 9876; ++b) {
				if (check(a, b)) {
					int c = a * b;
					System.out.println(a + " " + b + " " + c);
					set.add(c);
				}
			}
		}
		int sum = 0;
		while(!set.isEmpty()) {
			sum = sum + set.pollFirst();
		}
		System.out.println(sum);
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}
}
