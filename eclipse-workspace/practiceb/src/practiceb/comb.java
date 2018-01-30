package practiceb;

import java.util.Scanner;

public class comb {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			while (true) {
			long N = sc.nextLong();
			long K = sc.nextLong();
			if (N == 0 && K == 0) {
				break;
			}
			double result = 1.0;
			double a = 1.0;
			if (N-K>=K) {
				for (int i = 0; i <K ; i++) {
					result = (result / a) * N;
					a+=1;
					N-=1;
				}
				System.out.println((long) result);
			  
			}	
			else{
				for (long i = N; i > K; i--) {
					result = (result / a) * i;
					a+=1;
//					N-=1;
				}
				
				System.out.println((long) result);
			}	
			}
	}

}
