package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;






public class baekjoonStack1874 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		
		
		
		int a = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		int stand = 0;
		
		
		for (int i = 0; i < a; i++) {
			
			int num = Integer.parseInt(br.readLine());
			
			if (num > stand) {
				for (int j = stand + 1; j <= num ; j++) {
					stack.push(j);
					sb.append("+\n");
				
				}
				stand = num;
			}
			
			
			else if (stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-\n");
			
			
			
			
			
			
		}		
			
		
		System.out.println(sb);
		

	}

}
