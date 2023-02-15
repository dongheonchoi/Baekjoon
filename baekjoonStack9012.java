package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;






public class baekjoonStack9012 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
		
		int a = Integer.parseInt(br.readLine());
		
		
		
		for (int i = 0; i < a; i++) {
			ArrayList<Character> ar = new ArrayList<Character>(10000);
			String st = br.readLine();
			
			loop1:
			for (int j = 0; j < st.length(); j++) {
				char b = st.charAt(j);
				if (b == '(') {
					ar.add(b);	
				}else {
					if (ar.size() == 0){
						
						System.out.println("NO");
						break loop1;
					
					}else if (j == st.length()-1 && ar.size() == 1) {
						ar.remove(ar.size() - 1);
						System.out.println("YES");
						break loop1;
					
					
					}else {
						ar.remove(ar.size() - 1);
					}
				}		
			
			}
			if (ar.size() != 0) {
				System.out.println("NO");
				
			}
			
			
			
			
		}
		
		

	}

}
