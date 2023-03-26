package 되나;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj2667 {
	static int arr[][];
	static boolean check[][];
	static int count;
	static int x[] = {0, 0, 1, -1};
	static int y[] = {1, -1, 0, 0};
	static int nowX, nowY, a;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> num = new ArrayList<>();
		
		a = Integer.parseInt(br.readLine());
		
		check = new boolean[a][a];
		
		arr = new int[a][a];
				
		for (int i = 0; i < a; i++) {
			String line = br.readLine();
			for (int j = 0; j < a; j++) {
				arr[i][j] = Character.getNumericValue(line.charAt(j));
			}
		}
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (arr[i][j] == 1 && !check[i][j]) {
					count = 0;
					dfs(i,j);
					num.add(count);
				}
			}
		}
		
		Collections.sort(num);
		System.out.println(num.size());
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
		
		
		
	}
	static void dfs(int xPoint , int yPoint) {
		count++;
		check[xPoint][yPoint] = true;
		for (int i = 0; i < 4; i++) {
			nowX = xPoint + x[i];
			nowY = yPoint + y[i];
			if (range() && !check[nowX][nowY] && arr[nowX][nowY] == 1) {
				dfs(nowX, nowY);
			}
		}
	}
	static boolean range(){
		return(nowX >= 0 && nowX < a && nowY >= 0 && nowY < a);
	}
	
}
