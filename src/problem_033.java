package euler;

public class problem_033 {
	private static int gcd(int a, int b) {
		if (a < b) {
			return gcd(b, a);
		}
		if (a % b == 0) {
			return b;
		}
		return gcd(a - b, b);
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 0;
		int num1 = 0;
		int num2 = 0;
		int nominator = 1;
		int denominator = 1;
		for (a = 1; a < 10; ++a) {
			for (b = a; b < 10; ++b) {
				for ( c = 9; c > 0; --c) {
					num1 = 10 * a + b;
					num2 = 10 * b + c;
					if (num2 <= num1) {
						break;
					}
					if (num1 * c == num2 * a) {
						nominator = nominator * a;
						denominator = denominator * c;
						System.out.println(num1 + "/" + num2);
					}
				}
			}
		}
		System.out.println(nominator + "/" + denominator);
		System.out.println(denominator / gcd(nominator, denominator));
	}
}
