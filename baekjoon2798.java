package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken()); 
		int b = Integer.parseInt(st.nextToken()); 
		
	
		
		
		
		int[] num = new int[a];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		int temptResult = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				for (int j2 = j+1; j2 < num.length; j2++) {
						int sum = num[i] + num[j] + num [j2];
						if (sum > temptResult && b >= sum) {
							temptResult = sum ;
						}
					
					
					
					
				}
			}
		}
		if (temptResult != 0) {
			System.out.println(temptResult);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		br.close();
	}

}
