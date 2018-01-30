package practicebaek;

import java.util.ArrayList;
import java.util.Scanner;

public class combination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listn = new ArrayList();
		ArrayList<Integer> listk = new ArrayList();
		while (true) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		if (N == 0 && K == 0) {
			break;
		}
		listn.add(N);
		listk.add(K);
		}
		int result1 = 1;
		int result2 = 1;
		
		for (int i = 0; i < listn.size(); i++) {
			
		
		if (listn.get(i)-listk.get(i)>=listk.get(i)) {
		  for (int j = listn.get(i); j >= listn.get(i)-listk.get(i)+1; j--) {
			result1 = result1 * j;
		  }
		  for (int j = listk.get(i); j >= 1; j--) {
			result2 = result2 * j;
		  }
		}	
		else{
			for (int j = listn.get(i); j >= listk.get(i)+1; j--) {
				result1 = result1 * j;
			}
			for (int j = listn.get(i)-listk.get(i); j >= 1; j--) {
				result2 = result2 * j;
			}
		}
		
		int result = result1/result2;
		System.out.println(result);
		}
		
	}

}
