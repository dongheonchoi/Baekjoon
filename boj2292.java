package 되나;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int x = Integer.parseInt(br.readLine());
		
		int six = 1;
		
		for (int i = 0; i < 1000000000; i++) {
			six += i*6;
			if (x <= six) {
				System.out.println(i+1);
				break;
			}
		}
		
		
		
	}

}
