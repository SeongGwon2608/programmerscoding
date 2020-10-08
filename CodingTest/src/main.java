
public class main {

	public static void main(String[] args) {
		int[] p = {5, 4, 7, 2, 0, 6};
		int[] c = {4, 6, 4, 9, 2, 3};
		String answer = solution(6, p, c);
		System.out.println("answer : " + answer);

	}
	
	//n : 생산량과 주문량이 주어지는 날의 수
	//p : 일별 생산량은 담은 배열
	//c : 일별 주무량을 담은 배열
	public static String solution(int n, int[] p, int[] c) {
		String answer = "";
		int[] arrPrice = {100, 50, 25};
		int misCount = 0;
		int money = 0;
		int count = 0;
		
		for (int i = 0; i < n; i += 1) {
			try {
				if (p[i] >= c[i]) {
					p[i + 1] += p[i] - c[i];
					money += c[i] * arrPrice[misCount];
					count += 1;
					misCount = 0;
				} else {
					p[i + 1] += p[i];
					misCount += 1;
					count += 1;
				}
			} catch (Exception e) {
				if (p[i] >= c[i]) {
					money += c[i] * arrPrice[misCount];
					count += 1;
				} else {
					misCount += 1;
					count += 1;
				}
			}
			
			System.out.println("money : " +money);
			System.out.println("count : " + count);
			
			if(misCount == 3)
				break;
		}

		answer = String.format("%.2f", (double)money / count);
		System.out.println(answer);
		return answer;
	}
}
