//문제명	: JadenCase 문자열 만들기(연습문제)
//난이도	: Lv2
//해결일	: 20.10.08
//블로그	: O

package programmers_Lv2;

public class JadenCase {

	public static void main(String[] args) {
		String answer = solution("for the last week");
		System.out.println("answer : " + answer);

	}
	
	public static String solution(String s) {
        String answer = "";
        boolean upper = false;
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i+=1) {
        	if(s.charAt(i) == ' ') {
        		upper = true;
        		answer += s.charAt(i);
        		continue;
        	}
        	
        	if(i == 0 && s.charAt(i) >= 97 && s.charAt(i) <= 122) {
        		answer += (char)(s.charAt(i)-32);
        	}else if(upper == true) {
        		answer += (char)(s.charAt(i)-32);
        		upper = false;
        	}else {
        		answer += s.charAt(i);
        	}
        }
        
        return answer;
    }

}
