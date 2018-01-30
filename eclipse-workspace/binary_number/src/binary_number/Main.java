package binary_number;

import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String string = sc.nextLine();
			int N = string.length();
			int count = 0;
			for (int i = 0; i < string.length()-1; i++) {
				if (string.charAt(i)!=' ' && string.charAt(i+1) == ' ') {
					count++;
				}
					
				
			}
			if (string.charAt(N-1) != ' ') {
				count++;
			}
			
			System.out.println(count);
			
			
			
			
			
			
			
			
		}
	}


