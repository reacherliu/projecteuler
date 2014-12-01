package euler;

public class problem_021 {
    private static int getSum(int n) {
    	int i = 1;
    	int sum = 0;
    	for (i = 1; i <= n/2; ++i) {
    		if (n % i == 0) {
    			sum = sum + i;
    		}
    	}
    	return sum;
    }
    
    public static void main(String[] args) {
    	int[] d = new int[10000];
    	int i = 0;
    	for (i = 1; i < 10000; ++i) {
    		d[i] = getSum(i);
    	}
    	int sum = 0;
    	for (i = 1; i < 10000; ++i) {
    		if (d[i] < 10000 && d[i] != i && d[d[i]] == i) {
    			sum = sum + i;
    			System.out.println(i + " " + d[i]);
    		}
    	}
    	System.out.println(sum);
    }
}
