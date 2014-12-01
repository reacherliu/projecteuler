package euler;

////Do it recursively will lead to StackOverflowError
//public class problem_043 {
//	private static int[] primes = {2, 3, 5, 7, 11, 13, 17};
//	private static int[] digits = new int[10];
//	private static boolean[] used = new boolean[10];
//	private static long sum = 0;
//	private static void find(int index, int n) {
////		System.out.println(index + " " + n);
//		if (index == 0 && n == 10) {
//			return;
//		}
//		if (index == 10) {
////			System.out.println(getNumber());
//			sum = sum + getNumber();
//		}
//		while (n < 10 && (used[n] || !check(index, n))) {
//			n++;
//		}
//		if (index == 10 || n == 10) {
//			used[digits[index - 1]] = false;
//			find(index-1, digits[index-1] + 1);
//			return;
//		} else {
//			digits[index] = n;
//			used[n] = true;
//			find(index+1, 0);
//		} 
//	}
//	
//	private static boolean check(int index, int n) {
//		if (index < 3) {
//			return true;
//		}
//		int i = 3;
//		for (i = 3; i < index; ++i) {
//			if ((digits[i-2]*100 + digits[i-1]*10 + digits[i]) % primes[i-3] !=0) {
//				return false;
//			}
//		}
//		if ((digits[index-2]*100 + digits[index-1]*10 + n) % primes[index-3] !=0) {
//			return false;
//		}
//		return true;
//	}
//	
//	private static long getNumber() {
//		long result = 0;
//		int i = 9;
//		for (i = 0; i < 10; ++i) {
//			result = result * 10 + digits[i];
//		}
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		find(0, 1);
//		System.out.println(sum);
//	}
//}

public class problem_043 {
	private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17};
	private static int[] digits = new int[10];
	
	private static String getNext(String a) {
        int largestIndexK = -1;         // if this stays negative, we are at last permutation
        int largestIndexL = 0;
        char[] b = a.toCharArray();     // holds the next permutation as we build it
 
        // Find the largest index k such that a[k] < a[k + 1].
        // If no such index exists, the permutation is the last permutation.
        for (int k = 0; k < a.length() - 1; k++) {
            if (a.charAt(k) < a.charAt(k + 1)) {
                largestIndexK = k;
            }
        }
 
        if (largestIndexK == -1) {
            //System.out.println("last permutation");
            return "last";
        } 
 
        // Find the largest index l such that a[k] < a[l].
        // Since k + 1 is such an index, l is well defined and satisfies k < l.
        for (int l = 0; l < a.length(); l++) {
            if (a.charAt(largestIndexK) < a.charAt(l)) {
                largestIndexL = l;
            }
        }
 
        // Swap a[k] with a[l].
        b[largestIndexK] = a.charAt(largestIndexL);
        b[largestIndexL] = a.charAt(largestIndexK);
 
        // Reverse the sequence from a[k + 1] up to and including the final element a[n].
        String s = new String(b).substring(largestIndexK + 1);
        int x = 1;
        for (int i=s.length(); i > 0; i--) {
            b[largestIndexK + x] = s.charAt(i - 1);
            x++;
        }
 
        a = new String(b);      
 
        return a;
    }
	
	private static boolean Divisable(long n) {
		int i = 0;
		for (i = 9; i >= 3; --i) {
			if ((n % 1000) % PRIMES[i-3] != 0) {
				return false;
			}
			n = n / 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		long sum = 0;
		String str = "1023456789";
		long cur = 0;
		while(str != "last") {
			cur = Long.parseLong(str);
			if (Divisable(cur)) {
				System.out.println(cur);
				sum = sum + cur;
			}
			str = getNext(str);
		}
		System.out.println(sum);
	}
}