//문제명	: 이상한 문자 만들기(연습문제)
//난이도	: Lv1
//해결일	: 2020.02.27
//블로그	: O

package programmers_Lv1;

public class StrangeWord {

	public static void main(String[] args) {
		String s = "try hello world";
		
		String answer = solution(s);
		System.out.println("answer : " + answer);

	}
	public static String solution(String s) {
		String answer = "";
		int count = 0;	
		s = s.toLowerCase();

		char[] arr = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			if(arr[i] == ' ') {
				count = 0;
				answer += arr[i];
			}else if(count %2 == 0) {
				answer += (char)(arr[i]-32);
				count++;
			}else {
				answer += (char)arr[i];
				count++;
			}
		}
        return answer;
    }
}
