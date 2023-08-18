package boj_08_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1904 {
	public static StringBuilder sb = new StringBuilder();
	public static int[] map;
	
	
	public static void main(String[] args)throws IOException {//01타일 (DP)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		map = new int[n+100];
		map[1] = 1;
		map[2] = 2;
	
		if ( n == 1 || n == 2) {
			System.out.println(map[n]);
		}else {
			fib(n);
			System.out.println(map[n]);
		}
		
	}
	
	public static void fib(int n) {
		for (int i = 3; i <= n; i++) {
			map[i] = (map[i-1]+map[i-2])%15746;
		}
	}
	
}
