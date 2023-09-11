package boj_09_09;

import java.util.*;
import java.io.*;

public class boj_20366_2 {

    private static int N;
    private static int[] snowballs; // 눈덩이 지름

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        N = Integer.parseInt(br.readLine());
        // init
        snowballs = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            snowballs[i] = Integer.parseInt(st.nextToken());
        }

        // print
        System.out.println(solve());
    }

    private static int solve() {
        int min = Integer.MAX_VALUE;

        // 1. 눈덩이 지름 오름차순 정렬
        Arrays.sort(snowballs);

        // 2. 한쪽 눈사람 구성
        for (int i = 0; i < N; i++) {
            for (int j = i + 3; j < N; j++) { // 두 눈덩이 사이에 최소 2개 이상의 눈덩이가 들어가야 다른 쪽의 눈사람을 만들 수 있다.
                int height = snowballs[i] + snowballs[j]; // 눈사람 키

                // 3. 다른 한 쪽 눈사람 구성
                int left = i + 1;
                int right = j - 1;
                while (left < right) {
                    int tempHeight = snowballs[left] + snowballs[right]; // 다른 눈사람 키

                    if (tempHeight == height) { // 두 눈사람 키 차이가 0이면 최소
                        return 0;
                    } else if (tempHeight > height) {
                        right--; // 눈사람 키를 줄인다.
                    } else if (tempHeight < height) {
                        left++;
                    }

                    min = Math.min(min, Math.abs(height - tempHeight));
                }
            }
        }

        return min;
    }

}