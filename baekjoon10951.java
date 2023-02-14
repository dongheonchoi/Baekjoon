package practice;

import java.util.Scanner;

public class baekjoon10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		loop :
		while (true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			if (a == 0 && b ==0) {
				sc.close();
				break loop;
			}
			
			
			System.out.println(a + b);
		}
		
		
		
		
	}

}
