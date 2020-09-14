//문제명	: 가운데 글자 가져오기(연습문제)
//난이도	: Lv1
//해결일	: 2020.02.26
//블로그	: O

package programmers_Lv1;

public class MiddleWordLoad {

	public static void main(String[] args) {
		String s = "abcde";
		String s2 = "qwer";
		
		String answer = solution(s2);
		System.out.println("answer : " + answer);
	}
	
	public static String solution(String s) {
		String answer = "";
		
		if(s.length()%2 == 0) {
			answer += s.charAt((s.length()/2)-1);
			answer += s.charAt((s.length()/2));
		}else {
			answer += s.charAt((s.length()/2));
		}
        return answer;
    }

}
