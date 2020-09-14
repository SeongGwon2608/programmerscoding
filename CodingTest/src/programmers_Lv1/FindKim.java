//문제명	: 서울에서 김서방 찾기(연습문제)
//난이도	: Lv1
//해결일	: 2020.07.09
//블로그	: O

package programmers_Lv1;

public class FindKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim", "Ann"};
		String answer = solution(seoul);
		System.out.println("answer : " + answer);

	}
	public static String solution(String[] seoul) {
		String answer = "김서방은 ";

		int num = seoul.length;
		for(int i=0; i<num; i+=1) {
			if(seoul[i].equals("Kim")) {
				answer += i + "에 있다";
				break;
			}
		}
		return answer;
	}

}
