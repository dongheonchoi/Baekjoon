package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;






public class baekjoonStack10828 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
		
		int a = Integer.parseInt(br.readLine());
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>(10000);
		
		for (int i = 0; i < a; i++) {
			int s = Integer.parseInt(br.readLine());
			if (s != 0) {
				ar.add(0,s);				
			}else {
				ar.remove(0);				
			}
			
		}
		
		
		int sum = 0;
		for (int x : ar) {
			
			sum += x; 
			
		}
		System.out.println(sum);
		
		

	}

}
