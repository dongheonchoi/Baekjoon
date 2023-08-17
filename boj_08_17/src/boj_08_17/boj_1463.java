package boj_08_17;

import java.io.IOException;
import java.util.Scanner;

public class boj_1463 {
	//public static Map<Integer, Integer> map = new HashMap();
	public static int[] time = new int[10000000];
	
	
	public static void main(String[] args)throws IOException{ //dp 1로만들기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		cal(num , 0);
		
		System.out.println(time[1]);
		
	}
	
	public static void cal(int num, int t) {
		if (time[num] != 0 && time[num] <= t) {
			return;
		}else {
			time[num] = t;
		}		
		t++;
		if (num == 1) {
			return;			
		}
		if (num%6 == 0) {
			cal(num/3,t);
			cal(num/2,t);
			cal(num-1,t);			
		}else if (num%3 == 0) {
			cal(num/3,t);
			cal(num-1,t);
		}else if (num%2 == 0) {
			cal(num/2,t);
			cal(num-1,t);
		}else {
			cal(num-1,t);			
		}		
		
	}
//	if (map.containsKey(num) && map.get(num) <= t) {
//		return;
//	}else {
//		map.put(num, t);
//	}		
//	t++;
//	if (num == 1) {
//		return;			
//	}
//	if (num%6 == 0) {
//		cal(num/3,t);
//		cal(num/2,t);
//		cal(num-1,t);			
//	}else if (num%3 == 0) {
//		cal(num/3,t);
//		cal(num-1,t);
//	}else if (num%2 == 0) {
//		cal(num/2,t);
//		cal(num-1,t);
//	}else {
//		cal(num-1,t);			
//	}		
//	
//}
	

}
