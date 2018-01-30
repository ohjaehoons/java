package practice_123_sum;

import java.util.Scanner;

public class main {
	
	static int result1 = 1;
	int result2 = 1;
	
	public static int factorial1(int N) {
		for (int i = N; i >= 1; i--) {
			result1 = result1*i;
		}
		return result1;
	}
	
	public static int factorial(int N) {
		if (N==1 || N==0) {
			return 1;
		}
		return N * factorial1(N-1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i]=sc.nextInt();
		}
		int x = 0;
		int all = 0;
		for (int i = 0; i <N; i++) {
			int result = 0;
			for (int j = 0; j <= a[i]/3; j++) {
				for (int j2 = 0; j2 <= (a[i]-(3*j))/2; j2++) {
					x = a[i]-((3*j)+(2*j2));
					all = j+j2+x;
					result = result + (factorial1(all))/(factorial1(j)*factorial1(j2)*factorial1(x));
					
					
					
				}
			}
			System.out.println(result);
		}
	
	}

}
