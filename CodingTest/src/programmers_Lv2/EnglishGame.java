//문제명	: 영어 끝말잇기(Summer/Winter Coding(~2018)
//난이도	: Lv2
//해결일	: 20.10.10
//블로그	: O

package programmers_Lv2;

import java.util.Arrays;
import java.util.HashSet;

public class EnglishGame {

	public static void main(String[] args) {
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};	//3
		//String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};	//5
		//String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};		//2
		//String[] words = {"qwe", "eqwe", "eqwe"};	//2
		
		int[] answer = solution(3, words);
		System.out.println("answer : " + Arrays.toString(answer));
	}
	
	private static int[] solution(int n, String[] words) {
		int[] result = {0,0};
		HashSet<String> strSet = new HashSet<String>();
		int count = 0;
		char temp = words[0].charAt(0);

		for (int i = 0; i < words.length; i += 1) {
			count+=1;
			if (words[i].charAt(0) != temp || words[i].length() == 1) {
				result[0] = ((count - 1) % n) + 1;
				result[1] = ((count - 1) / n) + 1;
				break;
			} else {
				strSet.add(words[i]);
				temp = words[i].charAt(words[i].length()-1);
			}

			if (strSet.size() != count) {
				result[0] = ((count - 1) % n) + 1;
				result[1] = ((count - 1) / n) + 1;
				break;
			}
		}
		
		return result;
	}
}
