package boj_09_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj_13702 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		
		long hi = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			hi = Math.max(hi, arr[i]);
		}
		
		long lo = 1;
		
		while (lo <= hi) {
			long mid = (lo + hi)/2;
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				sum += arr[i] / mid;
			}
			
			if (sum >= K) {
				lo = mid+1;
			}else {
				hi = mid-1;
			}
		}
		
		System.out.println(hi);
		
		
		sc.close();
		
	}

}
