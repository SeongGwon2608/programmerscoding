//문제명	: 최대공약수와 최소공배수(연습문제)
//난이도	: Lv1
//해결일	: 2020.03.06
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;

public class GcdAndLcm {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		int n2 = 2;
		int m2 = 5;
		
		int[] answer = solution(n2, m2);
		System.out.println("answer : " + Arrays.toString(answer));

	}
	
	public static int[] solution(int n, int m) {
		int gcd = 1, lcm = 1;
		
		//크기에 따른 순서 정렬
		if(n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		for(int i=2; i<=n; i++) {
			if(n%i == 0 && m%i == 0) {
				gcd *= i;
				lcm *= i;
				n /= i;
				m /= i;
				i = 1;
			}
			if(i >= n) {
				lcm = lcm * n * m;
			}
		}
		int answer[] = {gcd, lcm};
		
		return answer;
    }

}
