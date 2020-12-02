import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		//int[][] delivery = {{1,3,1}, {3,5,0}, {5,4,0}, {2,5,0}};
		int[][] delivery = {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}};
		
		String answer = solution(7, delivery);
		System.out.println("answer : " + answer);

	}

	public static String solution(int n, int[][] delivery) {
		String answer ="";
		String[] arrStr = new String[n];
		
		for(int i=0; i<n; i+=1)
			arrStr[i] = "?";
		
		for(int i=0; i<delivery.length; i+=1) {
			if(delivery[i][2] == 1) {
				arrStr = able(delivery[i][0], delivery[i][1], arrStr);
			}
			System.out.println(Arrays.toString(arrStr));
		}
		for(int i=0; i<delivery.length; i+=1) {
			if(delivery[i][2] == 0) {
				arrStr = disable(delivery[i][0], delivery[i][1], arrStr);
			}
			System.out.println(Arrays.toString(arrStr));
		}

		for(int i=0; i<n; i+=1) 
			answer += arrStr[i];
		
		return answer;
	}
	
	private static String[] able(int n1, int n2, String[] str){
		str[n1-1] = "O";
		str[n2-1] = "O";
		return str;
	}
	
	private static String[] disable(int n1, int n2, String[] str){
		if(str[n1-1] == "O")
			str[n2-1] = "X";
		else if(str[n2-1] == "O")
			str[n1-1] = "X";
		return str;
	}
}
