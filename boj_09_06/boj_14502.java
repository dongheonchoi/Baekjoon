package boj_09_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_14502 {
	
	static int N;
	static int M;
	static int max;
	static int[] dirR = {1,-1,0,0};
	static int[] dirC = {0,0,1,-1};
	static int[][] map;
	static int[][] temp;
	static boolean[][] visited;
	static int[][] viruscheck = new int[2][10];
	
	
	

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		max = 0;
		
		map = new int[N][M];
		
		visited = new boolean[N][M];
		
		Arrays.fill(viruscheck[0], -1);
		
		int numVir = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) {
					viruscheck[0][numVir] = i;
					viruscheck[1][numVir] = j;
					numVir++;
				}
			}
		}
		wall(0,0,0);

		System.out.println(max);
	}

	public static void wall(int r , int c , int cnt) {
		if (cnt == 3) {
			check();
			return;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0 ) {
					map[i][j] = 1;
					wall(i, j , cnt+1);
					map[i][j] = 0;
					
				}
			}
		}
	}
	public static void check() {
		temp = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				temp[i][j] = map[i][j];
			}
		}
		
		
		for (int i = 0; i < 10; i++) {
			if (viruscheck[0][i] == -1) {
				break;
			}else {
				spread(viruscheck[0][i], viruscheck[1][i]);
			}
			
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(temp[i][j] == 0) {
					cnt++;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(temp[i]));
		}
		System.out.println();
		if (cnt > max) {
			max = cnt;
		}

		

	}
	public static void spread(int r, int c) {
		temp[r][c] = 2;
		for (int i = 0; i < 4; i++) {
			int nr = r + dirR[i];
			int nc = c + dirC[i];
			if (nr >= 0 && nr < N && nc >= 0 && nc < M && temp[nr][nc] == 0) {
				spread(nr, nc);
			}
		}
	}
	
	
}
