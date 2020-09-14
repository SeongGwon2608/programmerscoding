//문제명	: n진수 게임(Kakao Blind Recruitment)
//난이도	: Lv2
//해결일	: 20.08.19
//블로그	: O

package programmers_Lv2;

public class NNumberGame {

	public static void main(String[] args) {
		int n = 2;
		int t = 4;
		int m = 2;
		int p = 1;
		
		String answer = solution(n, t, m, p);
		System.out.println("answer : " + answer);

	}
	
	public static String solution(int n, int t, int m, int p) {
		String answer = "";
		int nCount = 0;
		
		for(int i=0; ; i+=1) {
			String strTemp = changeNum(n, i);
			for(int j=0; j<strTemp.length(); j+=1) {
				nCount += 1;
				if(nCount == p && answer.length() < t) {
					answer += strTemp.charAt(j);
				}else if(answer.length() == t){
					//System.out.println("return : " + answer);
					return answer;
				}
				
				if(nCount == m)
					nCount = 0;
			}
		}
	}
	
	//진법 변환후, 문자열로 반환하는 메소드
	private static String changeNum(int n, int num) {
		String result = "";
		
		//System.out.println(num + "의 " + n + "진법 변환");
		while(true) {
			result = remainder(num%n) + result;
			num/=n;

			if(num == 0)
				break;
		}
		//System.out.println(result);
		return result;
	}
	
	//16진법일 경우 10~15까지의 값을 문자로 변환
	private static String remainder(int num) {
		String result = "";

		switch (num) {
		case 10:
			result = "A";
			break;
		case 11:
			result = "B";
			break;
		case 12:
			result = "C";
			break;
		case 13:
			result = "D";
			break;
		case 14:
			result = "E";
			break;
		case 15:
			result = "F";
			break;
		default:
			result = result + num;
			break;
		}
		
		return result;
	}

}
