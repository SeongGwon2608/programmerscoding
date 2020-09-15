//문제명	: 삼각달팽이(월간 코드챌린지 시즌1)
//난이도	: Lv2
//해결일	: 2020.09.15
//블로그	: O

package programmers_Lv2;

import java.util.Arrays;

public class TriangleSnail {

	public static void main(String[] args) {
		int n = 5;
		int[] answer = solution(n);
		System.out.println("answer : " + Arrays.toString(answer));

	}

	public static int[] solution(int n) {
		int[][] arrMap = new int[n][n];
		int count = 1;
		int col = 0, row = -1;

		while (n > 0) {
			for (int i = 0; i < n; i += 1) {
				row += 1;
				arrMap[row][col] = count;
				count += 1;
			}
			n -= 1;
			for (int i = 0; i < n; i += 1) {
				col += 1;
				arrMap[row][col] = count;
				count += 1;
			}
			n -= 1;
			for (int i = 0; i < n; i += 1) {
				row -= 1;
				col -= 1;
				arrMap[row][col] = count;
				count += 1;
			}
			n -= 1;
		}

		n = 0;
		int[] answer = new int[count - 1];
		for (int i = 0; i < arrMap.length; i += 1) {
			for (int j = 0; j < arrMap.length; j += 1) {
				if (arrMap[i][j] != 0) {
					answer[n] = arrMap[i][j];
					n += 1;
				}
			}
		}

		return answer;
	}
}
