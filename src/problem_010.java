package euler;

public class problem_010 {
	     public static void main(String []args){
	        int[] primes = new int[1000000];
	        primes[0] = 2;
	        long sum = 2;
	        int current = 3;
	        int i = 1;
	        int j = 0;
	        boolean isPrime = true;
	        while (current < 2000000) {
	            int limit = (int)Math.sqrt((double)current);
	            isPrime = true;
	            for (j = 0; j < i && primes[i] <= limit; ++j) {
	                if (current % primes[j] == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                primes[i] = current;
	                sum = sum + current;
//	                System.out.println(i + " " + current);
	                i++;
	            }
	            current = current + 2;
	        }
	        System.out.println(sum);
	     }
}
