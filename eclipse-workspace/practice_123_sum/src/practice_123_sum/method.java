package practice_123_sum;

public class method {
	int result1 = 1;
	int result2 = 1;
	
	public int factorial(int N) {
		for (int i = N; i >= 1; i--) {
			result1 = result1*i;
		}
		return result1;
	}
	
	public int f(int N) {
		if (N==1 || N==0) {
			return 1;
		}
		return N * f(N-1);
	}
	
	

}
