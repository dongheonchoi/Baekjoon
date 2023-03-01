package practice;

public class baekjoondice23228 {

	public static void main(String[] args) {

	}

	
	//점수판 만들기 
	// n x m 크기의 바닥판을 받아오고  n x m 크기의 null 바닥판은 만든다. 점수를 옮겨 적고  0인 인덱스에 대해서 점수를 만들어 나가기
	//동서남북으로 갈수 있는 지는 어찌 판별할것이냐가 관건!!! ㄱ 모양도 동서남북이 되는건가?
	
	
	
	
	
	
	//직진을 하는 경우  (7-이전 바닥수)가 다음 바닥수가 된다.
	//직진을 하는데 갈곳이 없다면 이전 바닥수가 다음 바닥수가 된다
	
	//clockwize 나 counterclockwize 인데 갈 곳이 없다면 cw -> ccw , ccw -> cw로 바뀌어 진행 하게 된다. 
	
	
	//clockwize or counterclockwize인 경우  
	public static int bottom(int n, int n2, boolean cwccw) {
		
		
		int bottomValue = 0;
		
		if ((n == 2 && n2 == 1 && cwccw == true) || (n == 1 && n2 == 5 && cwccw == true)
				|| (n == 5 && n2 == 6 && cwccw == true) || (n == 6 && n2 == 2 && cwccw == true)) {

			bottomValue = 3;
		} else if ((n == 2 && n2 == 1 && cwccw == false) || (n == 1 && n2 == 5 && cwccw == false)
				|| (n == 5 && n2 == 6 && cwccw == false) || (n == 6 && n2 == 2 && cwccw == false)) {

			bottomValue = 4;
		} else if ((n == 3 && n2 == 1 && cwccw == true) || (n == 1 && n2 == 4 && cwccw == true)
				|| (n == 4 && n2 == 6 && cwccw == true) || (n == 6 && n2 == 3 && cwccw == true)) {

			bottomValue = 5;
		} else if ((n == 3 && n2 == 1 && cwccw == false) || (n == 1 && n2 == 4 && cwccw == false)
				|| (n == 4 && n2 == 6 && cwccw == false) || (n == 6 && n2 == 3 && cwccw == false)) {

			bottomValue = 2;
		} else if ((n == 2 && n2 == 4 && cwccw == true) || (n == 4 && n2 == 5 && cwccw == true)
				|| (n == 5 && n2 == 3 && cwccw == true) || (n == 3 && n2 == 2 && cwccw == true)) {

			bottomValue = 6;
		} else if ((n == 2 && n2 == 4 && cwccw == false) || (n == 4 && n2 == 5 && cwccw == false)
				|| (n == 5 && n2 == 3 && cwccw == false) || (n == 3 && n2 == 2 && cwccw == false)) {

			bottomValue = 1;
		}

		return bottomValue;
	}

}
