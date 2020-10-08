import java.util.ArrayList;
import java.util.Arrays;

public class main3 {

	public static void main(String[] args) {
		int[] d = {2,2,3,3};
		int answer = solution(15);
		System.out.println("answer : " + answer);
	}
	
	public static int solution(int n) {
        ArrayList <Integer> imsi = new ArrayList <Integer>();
        imsi.add(2);
        for(int i = 3; i <= n; i = i + 1) {
        	for(int j = 0; j < imsi.size(); j = j + 1) {
        		if(i % imsi.get(j) == 0) {
        			break;
        		}
        		if(j + 1 == imsi.size()) {
        			imsi.add(i);
        		}
        	}
        }
        int answer = imsi.size();
        return answer;
    }

}
