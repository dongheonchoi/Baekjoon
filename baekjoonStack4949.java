package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;






public class baekjoonStack4949 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
		
//		int a = Integer.parseInt(br.readLine());
		
		for (;;) {
			Stack<Character> stack = new Stack<>();
			String st = br.readLine();
			if (st.equals(".")) {
				break;
			}
			
			
			for (int j = 0; j < st.length(); j++) {
				char ch = st.charAt(j);
				if (ch == '(' || ch =='[') {
					
					stack.push(ch);
					
					
					
				}else if (ch == ')') {
					if (stack.size() != 0) {
						char pop1 = stack.pop();
						if (pop1 == '(') {
							continue;
						}else {
							System.out.println("no");
							break;
						}
						
					}else {
						System.out.println("no");
						break;
					}
					
					
					
			
					
				}else if (ch == ']') {
					if (stack.size() != 0) {
						char pop2 = stack.pop();
						if (pop2 == '[') {
							continue;
						}else {
							System.out.println("no");
							break;
						}
						
					}else {
						System.out.println("no");
						break;
					}
					
					
					
					
					
					
					
					
				}else if (ch == '.') {
					if (stack.size() == 0) {
						System.out.println("yes");
						break;
					}else {
						
						System.out.println("no");
						break;
					}
					
					
					
				}else {
					continue;
				}
			
				
				
			}//2for
		}//1for
		
		
		
		
		
	
		

	}

}
