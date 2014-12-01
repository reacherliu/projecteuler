package euler;

import java.math.BigInteger;

public class problem_116 {
	private static final int LENGTH = 50;
	// The number of placements if we place tileNum tiles with tileLength in 50-tile tile bar.
	private static BigInteger place(int tileLength, int tileNum) {
		int remainLen = LENGTH - tileLength * tileNum;
		return C(remainLen + tileNum, tileNum);
	}
	// Compute C(n, k).
	private static BigInteger C(int n, int k) {
		BigInteger result = BigInteger.ONE;
		int i = 1;
		for (i = 1; i <= k; ++i) {
			result = result.multiply(BigInteger.valueOf(n - i + 1));
			System.out.println(result);
		}
		for (i = 2; i <= k; ++i) {
			result = result.divide(BigInteger.valueOf(i));
		}
		return result;
	}
	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		int i = 1;
		for (i = 1; i <= 25; ++i) {
			System.out.println(place(2,i));
			sum = sum.add(place(2, i));
		}
		for (i = 1; i <= 16; ++i) {
			System.out.println(place(3,i));
			sum = sum.add(place(3, i));
		}
		for (i = 1; i <= 12; ++i) {
			System.out.println(place(4,i));
			sum = sum.add(place(4, i));
		}

		System.out.println(sum);
	}
}
//20365011073
//122106096
//5453760
//20492570929

//public class problem_116 {
//	public static void main(String[] args) {
//		long[] a = new long[100];  
//		long[] b = new long[100];  
//		long[] c = new long[100];  
//	    a[1]=1;a[2]=2;  
//	    b[1]=1;b[2]=1;b[3]=2;  
//	    c[1]=1;c[2]=1;c[3]=1;c[4]=2;  
//	    for (int i=3;i<=50;i++)  
//	        a[i]=a[i-1]+a[i-2];  
//	    for (int i=4;i<=50;i++)  
//	        b[i]=b[i-1]+b[i-3];  
//	    for (int i=5;i<=50;i++)  
//	        c[i]=c[i-1]+c[i-4];  
//	    long ans=a[50]+b[50]+c[50]-3; //Should minus all blacks.  
//	    System.out.println(a[50] - 1);
//	    System.out.println(b[50] - 1);
//	    System.out.println(c[50] - 1);
//
//	    System.out.println(ans);
//	}
//}
