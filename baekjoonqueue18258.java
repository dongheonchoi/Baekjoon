package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class baekjoonqueue18258 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		
		Deque<String> que = new LinkedList<>();
		
		for (int i = 0; i < a; i++) {
			
			String s = br.readLine();
			String[] s2 = s.split(" ");
			
			if (s2[0].equals("push")) {
				
				que.add(s2[1]);
			}
			
			else if (s2[0].equals("pop")) {
				if (que.size() == 0) {
					sb.append(-1).append('\n');
				}
				
				else {
					sb.append(que.poll()).append('\n');					
				}
			}
			
			else if (s2[0].equals("size")) {
				sb.append(que.size()).append('\n');
			}
			else if (s2[0].equals("empty")) {
				if (que.size() == 0) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
			}
			else if (s2[0].equals("front")) {
				if (que.size() == 0) {
					sb.append(-1).append('\n');
				}else {
					sb.append(que.peek()).append('\n');
				}
			}
			else{
				if (que.size() == 0) {
					sb.append(-1).append('\n');
				}else {
					sb.append(que.peekLast()).append('\n');
				}
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		System.out.print(sb);
		
		
		
		
		
		
		
	}
}
