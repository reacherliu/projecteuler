package euler;

public class problem_024 {
	private static int INDEX = 999999;
	public static void main(String[] args) {
		int [] facs = new int[10];
		facs[0] = 1;
		int i = 1;
		for (i = 1; i < 10; ++i) {
			facs[i] = facs[i-1] * i;
		}
		int [] res = new int[10];
		boolean [] used = new boolean[10];
		int residule = INDEX;
		int j = 0;
		for (i = 0; i < 10; ++i) {
			int temp = residule / facs[9 - i];
			residule = residule - temp * facs[9 - i];
			j = 0;
			while (j < 10) {
				if (!used[j]) {
					temp--;
					if (temp == -1) {
						res[i] = j;
						break;
					}
				}
				j++;
			}
			used[res[i]] = true;
		}
		for (i = 0; i < 10; ++i) {
			System.out.print(res[i]);
		}
		System.out.println();
	}
}
