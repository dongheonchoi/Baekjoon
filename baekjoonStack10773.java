package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;






public class baekjoonStack10773 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
		
		int a = Integer.parseInt(br.readLine());
		
		
		ArrayList<String> ar = new ArrayList<String>(10000);
		
		for (int i = 0; i < a; i++) {
			String s = br.readLine();
			String[] s2 =s.split(" ");
			
			if (s2[0].equals("push")) {
				ar.add(0,s2[1]);
				
			}else if (s2[0].equals("top")) {
				if (ar.size() == 0) {
					System.out.println(-1);
				}else {
					System.out.println(ar.get(0));					
				}
				
			}else if (s2[0].equals("size")) {
				System.out.println(ar.size());
			}else if (s2[0].equals("empty")) {
				if (ar.size() == 0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if (s2[0].equals("pop")) {
				if (ar.size() == 0) {
					System.out.println(-1);
				}else {
					System.out.println(ar.get(0));
					ar.remove(0);
				}
				
			}
			
			
			
		}


	}

}
