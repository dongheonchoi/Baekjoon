package boj_09_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class RC {
	int r;
	int c;

	public RC(int r, int c) {
		this.r = r;
		this.c = c;
	}
}

public class boj_2178 {
	static int N;
	static int M;
	static int cnt;
	static int[][] map;
	static boolean[][] visited;
	static int[] dirR = { 0, 1, 0, -1 }; // 우, 하 , 좌 , 상
	static int[] dirC = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - 48;
			}
		}

		cnt = 0;
		RC rc = new RC(0, 0);
		Queue<RC> Q = new LinkedList<>();
		Q.add(rc);
		loof: while (!Q.isEmpty()) {
			cnt++;
			int size = Q.size();
			for (int i = 0; i < size; i++) {
				RC nRC = Q.poll();
				for (int j = 0; j < 4; j++) {
					int nr = nRC.r + dirR[j];
					int nc = nRC.c + dirC[j];
					if (nr == N - 1 && nc == M - 1) {
						break loof;
					}
					if (nr < N && nr >= 0 && nc < M && nc >= 0 && !visited[nr][nc] && map[nr][nc] != 0) {
						visited[nr][nc] = true;
						rc = new RC(nr, nc);
						Q.add(rc);
					}

				}
			}
		} // while
		sb.append(cnt + 1).append("\n");
		System.out.println(sb);
	}

}
