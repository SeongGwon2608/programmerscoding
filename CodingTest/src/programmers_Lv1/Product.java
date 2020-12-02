//문제명	: 내적(월간 코드 챌린지 시즌1)
//난이도	: Lv1
//해결일	: 2020.12.02
//블로그	: O
//문제 주소 : https://programmers.co.kr/learn/courses/30/lessons/70128

package programmers_Lv1;

public class Product {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
		
		int result = solution(a, b);
		System.out.println("result : " + result);
	}
	public static int solution(int[] a, int[] b) {
		int answer = 0;
		
		for(int i=0; i<a.length; i+=1) {
			answer += a[i] * b[i];
		}
		return answer;
	}

}
