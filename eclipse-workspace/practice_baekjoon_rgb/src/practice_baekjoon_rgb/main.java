package practice_baekjoon_rgb;

import java.util.Scanner;

/*
 * rgb거리 구하기(동적계획법)
 * */
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] r = new int[N];
		int[] g = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			r[i] = sc.nextInt();
			g[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int[] rs = new int[N];
		int[] gs = new int[N];
		int[] bs = new int[N];
		
		rs[0]=r[0];
		gs[0]=g[0];
		bs[0]=b[0];
		for (int i = 0; i < N-1; i++) {
			if (gs[i]+r[i+1]>bs[i]+r[i+1]) {
				rs[i+1]=bs[i]+r[i+1];
			}else {
				rs[i+1]=gs[i]+r[i+1];
			}
			
			if (rs[i]+g[i+1]>bs[i]+g[i+1]) {
				gs[i+1]=bs[i]+g[i+1];
			}else {
				gs[i+1]=rs[i]+g[i+1];
			}
			
			if (gs[i]+b[i+1]>rs[i]+b[i+1]) {
				bs[i+1]=rs[i]+b[i+1];
			}else {
				bs[i+1]=gs[i]+b[i+1];
			}
		}
		if (rs[N-1]<=gs[N-1]) {
			if (rs[N-1]<=bs[N-1]) {
				System.out.println(rs[N-1]);
			}else {
				System.out.println(bs[N-1]);
			}
		}else {
			if (gs[N-1]>bs[N-1]) {
				System.out.println(bs[N-1]);
			}else {
				System.out.println(gs[N-1]);
			}
		}
		
		
		
		/*###
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int r1 = 1; r1 < 4; r1++) {
			count=r1;
			if (count==1) {
				sum=r[0];
			}else if (count==2) {
				sum=g[0];
			}else {
				sum=b[0];
			}
			for (int i = 1; i < N; i++) {
				if (count==1) {
					if (g[i]>b[i]) {
						sum=sum+b[i];
						count=3;
					}else {
						sum=sum+g[i];
						count=2;
					}
				}else if (count==2) {
					if (r[i]>b[i]) {
						sum=sum+b[i];
						count=3;
					}else {
						sum=sum+r[i];
						count=1;
					}
					
				}else {
					if (r[i]>g[i]) {
						sum=sum+g[i];
						count=2;
					}else {
						sum=sum+r[i];
						count=1;
					}
				}
			}
			if (r1==1) {
				sum1=sum;
			}else if (r1==2) {
				sum2=sum;
			}else {
				sum3=sum;
			}
		}
		if (sum1>sum2 && sum3>sum2) {
			System.out.println(sum2);
		}else if (sum1<sum2&&sum1<sum3) {
			System.out.println(sum1);
			
		}else {
			
			System.out.println(sum3);
		}
		 * */
	

	}

}
