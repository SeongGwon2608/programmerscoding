//문제명	: 예상 대진표(연습문제)
//난이도	: Lv2
//해결일	: 20.08.17
//블로그	: O

package programmers_Lv2;

public class CountryOf124 {

	public static void main(String[] args) {
		int n = 4;
		String answer = solution(n);
		System.out.println("answer : " + answer);

	}
	
	public static String solution(int n){
		String answer = "";
		int nTemp = 3;
		int nNum = 3;
		int nDigit = 2;
	
		//자리수 계산
		if (n > 12) {
			do {
				nTemp = nTemp + (nNum * 3);
				nNum *= 3;
				nDigit += 1;
			} while (nTemp + (nNum*3) < n);
		}
		//3보다 작은 경우 따로 처리
		if(n <= 3) {
			n -= 1;
			answer = answer + n;			
			answer = change(answer, 1);
			return answer;
		}
		
		n = n - nTemp - 1;
		do{
			//0이 입력되는 경우를 위한 예외처리 
			try {
				answer = (n%3) + answer;
				n /= 3;
			}catch (Exception e) { }
		}while(n != 0); 
		answer = change(answer, nDigit);
		
		return answer;
	}
	private static String change(String str, int nDigit) {
		String result = "";
	
		for(int i=str.length(); i<nDigit; i+=1) {
			str = "0" + str;
		}
			
		for(int i=0; i<nDigit; i+=1) {
			if(str.charAt(i) == '0') {
				result = result + "1";
			}else if(str.charAt(i) == '1') {
				result = result + "2";
			}else if(str.charAt(i) == '2') {
				result = result + "4";
			}
		}
		return result;
	}

}
