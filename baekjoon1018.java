package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		char[][] num = new char[a][b];

		for (int i = 0; i < a; i++) {
			String str = br.readLine();

			for (int i2 = 0; i2 < b; i2++) {
				num[i][i2] = str.charAt(i2);

			}
		}

		char compare = 'W';
		int result = 64;

		for (int i = 0; i <= a - 8; i++) {
			for (int j = 0; j <= b - 8; j++) {
				int tempResult = 0;

				for (int j2 = i; j2 < i + 8; j2++) {
					if (compare == 'W') {
						compare = 'B';
					} else {
						compare = 'W';
					}
					for (int k = j; k < j + 8; k++) {
						if (compare == num[j2][k]) {
							tempResult++;
						}
						if (compare == 'W') {
							compare = 'B';
						} else {
							compare = 'W';
						}
					}
				} // 8x8 한번 돌림

				tempResult = Math.min(tempResult, 64 - tempResult);

				if (tempResult < result) {
					result = tempResult;
				}

			}
		}
		System.out.println(result);
		br.close();
	}

}
