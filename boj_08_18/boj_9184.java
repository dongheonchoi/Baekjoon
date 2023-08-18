package boj_08_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9184 {
	public static StringBuilder sb = new StringBuilder();
	public static int[][][] map = new int[51][51][51];
	
	
	public static void main(String[] args)throws IOException {//신나는 함수 실행 (DP)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0, b = 0, c = 0;
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			sb.append("w("+a+", "+b+", "+c+") = ");
			sb.append(DP(a,b,c)).append("\n");
		}
		System.out.println(sb);
		
	}
	
	public static int DP(int a , int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		if (map[a][b][c] != 0) {
			return map[a][b][c];
		} 
		if (a > 20 || b > 20 || c > 20) {
			map[a][b][c] = DP(20, 20, 20);
			return map[a][b][c];
		}
		if (a < b && b < c) {
			map[a][b][c] = DP(a, b, c-1) + DP(a, b-1, c-1) - DP(a, b-1, c);
			return map[a][b][c];
		}
		map[a][b][c] = DP(a-1, b, c) + DP(a-1, b-1, c) + DP(a-1, b, c-1) - DP(a-1, b-1, c-1);
		return map[a][b][c];
	}
	
	
}
