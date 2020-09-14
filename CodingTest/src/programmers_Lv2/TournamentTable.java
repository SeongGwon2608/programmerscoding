//문제명	: 예상 대진표(2017팁스타운)
//난이도	: Lv2
//해결일	: 20.08.14
//블로그	: O

package programmers_Lv2;

public class TournamentTable {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		
		int answer = solution(n, a, b);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(int n, int a, int b){
		int answer = 0;
		
		while(a != b) {
            //System.out.println(a + " " + b + " " + answer);
            
			// a와 b가 홀수이면 1을 더하여 연산
			a = a / 2 + (a % 2);
			b = b / 2 + (b % 2);

			answer += 1;
		}
		return answer;
    }
}
