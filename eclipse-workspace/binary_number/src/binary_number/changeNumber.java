package binary_number;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class changeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String changenumber = Integer.toBinaryString(number);
		for (int i = changenumber.length()-1; i >=0 ; i--) {
			System.out.print(changenumber.charAt(changenumber.length()-1-i));
			if (i==0) {
				continue;
			}else if (i%4==0) {
				System.out.print("_");
				
			}
			
		}
		
	}
	

}
