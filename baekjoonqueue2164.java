package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class baekjoonqueue2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int a = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < a; i++) {
			
			String[] b = br.readLine().split(" ");
			int a2 = Integer.parseInt(b[0]);
			int a3 = Integer.parseInt(b[1]);
			
			
			String[] c = br.readLine().split(" ");
			
			
			int result = Integer.parseInt(c[a3]);
			
			
			Deque<Integer> que = new LinkedList<>();

			int count = 0;
			
			for (int j = 0; j < a2 ; j++) {
				
				
				
				
				
				
			}
			
			
			
			

			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		for (int i = 1; i <= a ; i++) {
			
			que.add(i);
			
		}
		
		
		
		while (que.size() != 1) {
			que.poll();	

			if (que.size() != 1) {

				int b = que.poll();											
				que.add(b);

			}
			
		}
		
		
		
		
		System.out.println(que.peek());
		
		
		
		System.out.print(sb);
			
		}
}
