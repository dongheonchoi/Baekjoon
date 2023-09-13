package boj_09_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2343 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr =new int[N];
		
		int hi = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			hi += arr[i];
		}
		
		int lo = 1;
		while (lo <= hi) {
			int mid = (lo + hi)/2;
//			System.out.println(lo + " "+ mid + " " +  hi);
			
			int max = 0; 
			int start = 0;
			for (int i = 0; i < M; i++) {
				int temp = 0;
				for (int j = start; j < N; j++) {
					temp += arr[j];
					start = j;
					if (temp > mid) {
//						System.out.println(temp -= arr[j]);
						break;
					}
				}	
			}
			
			if (start == N-1) {
				hi = mid-1;
			}else {
				lo = mid+1;
			}
						
		}
		System.out.println(lo+2);
		
		
	}

}

//						temp -= arr[j];
//						if (temp > max) {
//							max = temp;
//						}