package practice;

import java.util.Scanner;

public class baekjoon10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = a + b;
		
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		sc.close();
	}

}
