package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		
		
		ArrayList weight = new ArrayList();
		ArrayList height = new ArrayList();
		
		
		
		for (int i = 0; i < a ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			weight.add(Integer.parseInt(st.nextToken())); 
			height.add(Integer.parseInt(st.nextToken())); 
			
		}
		
		for (int i = 0; i < a; i++) {
			int count = 1;
			int b = (int)weight.get(i);
			int c = (int)height.get(i); 
			
			for (int j = 0; j < a; j++) {
				int d = (int)weight.get(j);
				int e = (int)height.get(j);
			
				if (d > b && e > c) {
					count ++;
				}	
			}
		
			sb.append(count + " ");
		
		
		
		}
			
			
			
		System.out.println(sb);	
		
		
		
		
		br.close();
	
	}

}
