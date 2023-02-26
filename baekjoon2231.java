package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String a = br.readLine();
		
		int b = a.length();
		
		int c = Integer.parseInt(a);
		
		int count = 0;
		
		for (int i = c - b*9 ; i < c; i++) {
			
			int d = i;
			
			int sum = 0;
			
			count += 1;
			
			while ( d > 0) {
				sum += d%10;
				d /= 10;
				
				
			}
			if (sum + i == c ) {
				
				System.out.println(i);
				break;
			}
			else if (count == b*9) {
		
				System.out.println(0);
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
