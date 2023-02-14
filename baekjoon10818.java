package practice;


import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();

		sc.nextLine(); //버퍼 비워주기

		String a = sc.nextLine();

		String[] num1 = a.split(" ");
		

		int[] arr = new int[len];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(num1[i]);

		}
		
		Arrays.sort(arr); //배열을 정렬 함으로 최솟값과 최댓값을 구함
		
		System.out.println(arr[0] + " " + arr[len-1]);
		
		
		
		sc.close();
	}

}
