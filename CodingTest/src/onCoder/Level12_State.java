//문제명	: 대선전략 수립(챌린지)
//난이도	: Level12
//해결일	: 2020.12.03
//블로그	: O

package onCoder;

public class Level12_State {

	public static void main(String[] args) {
		String[] stats = { "122", "1122", "1222" };
		int result = solution(stats);
		System.out.println(result);
	}

	public static int solution(String[] stats) {
		double[] statePer = new double[stats.length];

		for (int i = 0; i < stats.length; i += 1) {
			int one = 0;
			for (int j = 0; j < stats[i].length(); j += 1) {
				if (stats[i].charAt(j) == '1') {
					one += 1;
				}
			}
			statePer[i] = (double) one / stats[i].length();
			// System.out.println(Arrays.toString(statePer));
		}

		int answer = 0;
		double standard = statePer[0];

		for (int i = 0; i < statePer.length; i += 1) {
			if (standard > statePer[i]) {
				answer = i;
				standard = statePer[i];
			}
		}
		return answer;
	}
}
