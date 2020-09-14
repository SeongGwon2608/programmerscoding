//문제명	: 소수찾기(연습문제)
//난이도	: Lv1
//해결일	: 2020.08.26
//블로그	: O

package programmers_Lv1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 10;
		int n2 = 5;
		
		int answer = solution(n);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(int n) {
		int answer = 0;
		boolean flag = true;
		
		System.out.println("=====" + n + "=====");
		for (int i = 2; i <= n; i += 1) {
			flag = true;
			if (i % 2 != 0 || i == 2) {
				if (i % 3 != 0 || i == 3) {
					for (int j = 2; j < Math.sqrt(i)+1 ; j += 1) {
						//System.out.println(i + " : " + j);
						if (i % j == 0 && i != j) {
							flag = false;
							break;
						}
					}
				}else
					flag = false;
		
			} else
				flag = false;

			if (flag) {
				answer += 1;
			}
			//System.out.println(answer);
		}

		return answer;
	}

}
