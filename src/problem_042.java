package euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class problem_042 {
	private static boolean check(int n) {
		int sqrtn = (int) Math.sqrt((double) 2*n);
		return (2 * n == sqrtn * (sqrtn + 1));
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"/home/reacher/workspace/euler/src/euler/p042_words.txt"));
		String[] words = reader.readLine().split(",");
		int num = 0;
		int len = words.length;
		int i = 0;
		int j = 0;
		int sum = 0;
		for (i = 0; i < len; ++i) {
			sum = 0;
			// Ignore quotes.
			for (j = 1; j < words[i].length() - 1; ++j) {
				sum = sum + (words[i].charAt(j) - 'A') + 1;
			}
			if (check(sum)) {
				num++;
			}
		}
		System.out.println(num);
	}
}
