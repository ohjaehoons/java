package practice;

public class pythonPractice {
	public boolean sosu(int num){ //소수판정함수
		if (num==2) {
			return false;
		}else if (num>2) {
			int count = 0;
			for (int i = 2; i <= num-1 ; i++) {
				if (num%i==0) {
					count++;
				}else {
					continue;
				}
				
			}
			if (count == 0) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
		
	}

}
