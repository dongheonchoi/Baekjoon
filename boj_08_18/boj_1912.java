package boj_08_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1912 {
	
	public static void main(String[] args)throws IOException {//연속합 (DP)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] map = new int[num+10];
		int[] dp = new int[num+10];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = map[0];
		int max = map[0];
		for (int i = 1; i < num; i++) {
			dp[i] = Math.max(dp[i-1] + map[i] , map[i]); //음수인 순간 누적합을 초기화
			
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		
		
		
		
		
		
	}
	

	
}
