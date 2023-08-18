package boj_08_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9461 {
	public static StringBuilder sb = new StringBuilder();
	public static long[] map;
	
	public static void main(String[] args)throws IOException {//신나는 함수 실행 (DP)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		map = new long[110];
		map[1] = 1;
		map[2] = 1;
		map[3] = 1;
		
		for (int i = 1; i <= test_case; i++) {
			int num = Integer.parseInt(br.readLine());
			meth(num);
			sb.append(map[num]).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static long meth(int num) {
		if (map[num] != 0) {
		}else {
			map[num] = meth(num-2) + meth(num-3);
		}
		return map[num];
	}
	
	
}
