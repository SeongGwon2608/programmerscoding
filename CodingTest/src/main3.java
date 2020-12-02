import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class main3 {

	public static void main(String[] args) {
		String encrypted_text1 = "qyyigoptvfb"; 
		String key1 = "abcdefghijk";
		
		String key = "abcdefghijk";
		String answer = solution("qyyigoptvfb", "abcdefghijk", 3);
		
		System.out.println("answer : " + answer);
	}
	
	public static String solution(String encrypted_text, String key, int rotation) {
        String answer = "";
        
        String result = rotationString(encrypted_text, rotation);
        
        char[] charEncText = result.toCharArray();
        char[] charKey = key.toCharArray();
        
        for(int i=0; i<result.length(); i+=1) {
        	answer += changechar(charEncText[i], charKey[i]);
        	System.out.println(answer);
        }
        System.out.println(answer);

        return answer;
    }
	
	private static char changechar(char encText, char key) {
		int nKey = key - 96;
		
		char result = (char)(encText - nKey);
		if(result < 97)
			result = (char)(result + 26);
		
		return result;
	}
	
	private static String rotationString(String strText, int rotation) {
		String result = "";
		char[] charString = strText.toCharArray();

		Deque<String> strDeque = new LinkedList<String>();
		for (int i = 0; i < charString.length; i += 1) {
			strDeque.offer(charString[i] + "");
		}
		System.out.println(strDeque);
		
		if (rotation > 0) {
			for (int i = 0; i < rotation; i += 1) {
				String str = strDeque.pollFirst();
				strDeque.offerLast(str);
				System.out.println(strDeque);
			}
		}else if(rotation < 0) {
			for (int i = 0; i < (rotation * -1); i += 1) {
				String str = strDeque.pollLast();
				strDeque.offerFirst(str);
				System.out.println(strDeque);
			}
		}
		
		for(int i=0; i<charString.length; i+=1) {
			result += strDeque.poll();
		}
		return result;
	}
}


