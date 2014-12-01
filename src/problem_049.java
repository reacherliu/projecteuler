package euler;

public class problem_049 {
    public static boolean isPrime(int a) {
        int limit = (int) Math.sqrt((double) a);
        for (int i = 2; i <= limit; ++i) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean check (int num, int a, int b, int c, int d) {
    	if (num % 10 != d) {
    		return false;
    	}
    	num = (num - d) / 10;
        if (num / 100 != a) {
            return false;
        }
        num = num % 100;
        if (num == b*10 + c || num == c*10 + b) {
            return true;
        }
        return false;
    }
    
    public static void main(String []args){
       int i = 1;
       int j = 1;
       int k = 1;
       int l = 1;
       int num1 = 0;
       int num2 = 0;
       int num3 = 0;
       for (i = 1; i < 10; ++i) {
           for (j = i; j < 10; ++j) {
               for (k = j; k < 10; ++k) {
            	   for (l = 1; l < 10; l = l + 2) {
	                   num1 = i*100 + j*10 + k;
	                   num1 = num1 * 10 + l;
	                   if (isPrime(num1)) {
	                       num2 = j*100 + i*10 +k;
	                       num2 = num2 * 10 + l;
	                       if (num2 == num1) {
	                    	   continue;
	                       }
	                       if (isPrime(num2)) {
	                           num3 = 2*num2 - num1;
	                           if (check(num3,k,i,j,l) && isPrime(num3)) {
	                               System.out.println(num1 + " " + num2 + " " + num3);
	                           }
	                       }
	                       num2 = j*100 + k*10 + i;
	                       num2 = num2*10 + l;
	                       if (num2 == num1) {
	                    	   continue;
	                       }
	                       if (isPrime(num2)) {
	                           num3 = 2*num2 - num1;
	                           if (check(num3,k,i,j,l) && isPrime(num3)) {
	                               System.out.println(num1 + " " + num2 + " " + num3);
	                           }
	                       }
	                   }
	                   num1 = i*100 + k*10 + j;
	                   num1 = num1 * 10 + l;
	                   if (isPrime(num1)) {
	                       num2 = j*100 + i*10 +k;
	                       num2 = num2 * 10 + l;
	                       if (num2 == num1) {
	                    	   continue;
	                       }
	                       if (isPrime(num2)) {
	                           num3 = 2*num2 - num1;
	                           if (check(num3,k,i,j,l) && isPrime(num3)) {
	                               System.out.println(num1 + " " + num2 + " " + num3);
	                           }
	                       }
	                       num2 = j*100 + k*10 + i;
	                       num2 = num2 * 10 + l;
	                       if (num2 == num1) {
	                    	   continue;
	                       }
	                       if (isPrime(num2)) {
	                           num3 = 2*num2 - num1;
	                           if (check(num3,k,i,j,l) && isPrime(num3)) {
	                               System.out.println(num1 + " " + num2 + " " + num3);
	                           }
	                       }
	                   }
	               }
	           }
	       }
	    }
    }
}
