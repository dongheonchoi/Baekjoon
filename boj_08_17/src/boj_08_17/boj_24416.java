package boj_08_17;

import java.io.IOException;
import java.util.Scanner;

public class boj_24416 {
	public static int a = 0;
	public static int b = 0;
	public static int[] arr;

	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n  = sc.nextInt();	
		arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		fib1(n);
		fib2(n);
		
		sb.append(a + " " + b);
		System.out.println(sb);
	}

	public static void fib1(int num) {
		if (num == 1 || num == 2) {
			a++;
			return;
		}else {
			fib1(num-1);
			fib1(num-2);
		}
		
	}

	
	public static int fib2(int num) {
		if (num == 2 || num == 1 || arr[num]!=0) {
			return arr[num];
		}else {
			b++;
			arr[num] = fib2(num-1) + fib2(num-2);
			return arr[num];
		}
	}
	
	
}
