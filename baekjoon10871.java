package practice;

import java.util.Scanner;

public class baekjoon10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int num = sc.nextInt();
		
		int[] numArr = new int[len]; 
		
		for (int i = 0; i < len; i++) {
			numArr[i] = sc.nextInt();
			if (numArr[i] < num) {
				System.out.print(numArr[i] + " ");
			}

		}
		sc.close();
	}

}
