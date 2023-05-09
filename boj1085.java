package 되나;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int temResult1 ;
		int temResult2 ;
		
		if (x >= (double)w/2) {
			temResult1 = w - x; 
		}else {
			temResult1 = x;
		}
		
		if (y >= (double)h/2) {
			temResult2 = h - y;
		}else {
			temResult2 = y;
		}
		
		if (temResult1 >= temResult2) {
			System.out.println(temResult2);
		}else {
			System.out.println(temResult1);
		}
		
		
	}

}
