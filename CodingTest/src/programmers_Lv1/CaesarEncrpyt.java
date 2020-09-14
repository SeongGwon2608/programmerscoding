//문제명	: 시저암호(연습문제)
//난이도	: Lv1
//해결일	: 2020.08.24
//블로그	: O

package programmers_Lv1;

public class CaesarEncrpyt {

	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		
		String s2 = "a B z";
		int n2 = 4;
		
		String answer = solution(s2, n2);
		System.out.println("answer : " + answer);

	}
	
	public static String solution(String s, int n) {
        String answer = "";
        char[] arrChar = s.toCharArray();
        
        for(int i=0; i<arrChar.length; i+=1) {
        	answer += pushString(arrChar[i], n);
        	System.out.println(answer);
        }
        
        return answer;
	}
	
	private static String pushString(char ch, int n) {
		String str = "";
		//소문자
		if((int)ch >= 97) {
			if(ch + n <= 122)
				str = "" + (char)(ch + n);
			else {
				str = "" + (char)(ch + n - 26);
			}
		}else if((int)ch == 32) {
			str = " ";
		}else {
			if(ch + n <= 90)
				str = "" + (char)(ch + n);
			else {
				str = "" + (char)(ch + n - 26);
			}
		}
		return str;
	}
}
