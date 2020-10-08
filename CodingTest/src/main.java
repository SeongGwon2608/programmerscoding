
public class main {

	public static void main(String[] args) {
		int answer = solution(100000000);
		System.out.println("answer : " + answer);

	}

	public static int solution(int n) {
		int answer = 0;
		String thNum = "";
		boolean zero = false;

		// 3진수 변환 + 반전
		while (n != 0) {
			if(zero == false && n%3 == 0) {
				n /= 3;
			}else {
				thNum = (n % 3) + thNum;
				n /= 3;
				zero = true;
			}
		}
		
		for (int i = 0; i < thNum.length(); i += 1) {
			answer += (thNum.charAt(i) - 48) * squared(i);
		}

		return answer;
	}

	public static int squared(int num) {
		int result = 1;
		for (int i = 0; i < num; i += 1) {
			result *= 3;
		}
		return result;
	}
}
