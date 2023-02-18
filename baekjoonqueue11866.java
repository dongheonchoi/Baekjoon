package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class baekjoonqueue11866 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] aSt = br.readLine().split(" ");
		
		int a = Integer.parseInt(aSt[0]);
		int b = Integer.parseInt(aSt[1]);
		
		
		
		Deque<Integer> que = new LinkedList<>();

		
		for (int i = 1; i <= a; i++) {

			que.add(i);

		}
		sb.append("<");
		
		while (que.size() != 0) {

			for (int i = 0; i < b-1; i++) {
				int c = que.poll();
				que.add(c);
			}
			if (que.size() == 1) {
				
				sb.append(que.poll());
			}else {
				sb.append(que.poll() + ", ");				
			}

		}

		sb.append(">");

		System.out.print(sb);

	}
}