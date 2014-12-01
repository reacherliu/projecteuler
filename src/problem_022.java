package euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class problem_022 {
	private static void quickSort (String[] names, int low, int high) {
		if (low >= high) {
			return;
		}
		int pindex = low + (high - low) / 2;
		String pvalue = names[pindex];
		names[pindex] = names[high];
		int i = 0;
		int sindex = low;
		for (i = low; i < high; ++i) {
			if (names[i].compareTo(pvalue) < 0) {
				String temp = names[sindex];
				names[sindex] = names[i];
				names[i] = temp;
				sindex++;
			}
		}
		names[high] = names[sindex];
		names[sindex] = pvalue;
		quickSort(names, low, sindex - 1);
		quickSort(names, sindex + 1, high);
	}
	
	private static void quickSort1 (String[] names, int low, int high) {
		if (low >= high) {
			return;
		}
		int pindex = low + (high - low) / 2;
		String pivot = names[pindex];
		int i = low;
		int j = high;
		while (i <= j) {
			while (names[i].compareTo(pivot) < 0) {
				i++;
			}
			while (names[j].compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				String temp = names[i];
				names[i] = names[j];
				names[j] = temp;
				i++;
				j--;
			}
		}
		quickSort(names, low, j);
		quickSort(names, i, high);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
			"/home/reacher/workspace/euler/src/euler/p022_names.txt"));
		String[] names = reader.readLine().split(",");
		int len = names.length;
		quickSort(names, 0, len - 1);
		int i = 0;
		int j = 0;
		long sum = 0;
		long subsum = 0;
		for (i = 0; i < len; ++i) {
			subsum = 0;
			// Ignore quotes.
			for (j = 1; j < names[i].length()-1; ++j) {
				subsum = subsum + names[i].charAt(j) - 'A' + 1;
			}
			sum = sum + subsum * (i + 1);
		}
		System.out.println(sum);
	}
}
