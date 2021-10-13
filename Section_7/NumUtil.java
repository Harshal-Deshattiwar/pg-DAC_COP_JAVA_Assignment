

public class NumUtil {
	
	public static double getPower(double x,int n) {
		return Math.pow(x,n);
	}
	
	public static long getFactorial(int num) {
		long fact=1;
		if (num == 0) return (fact-1);
		else {
			for (int i =1; i<=num; i++) {
				
				fact = (fact *i);
				
			}
		}
		return fact;
		
	}
	
	
	public static boolean isPrime(int num) {
		int count = 0;
		if(num == 0 || num == 1) return false;
		else {
			for (int i = 2; i <=(num/2.0); i++) {
				if (num % i ==0) {
					count +=1;
					break;
				}			
			}
		if (count == 0) return true;
		else return false;
				
		}
		
	}
	
	public static boolean isEven(int num) {
		
		if (num % 2 == 0) return true;
		else return false;
	}
	public static boolean isOdd(int num) {
			
			if (num % 2 == 0) return false;
			else return true;
	}

}
