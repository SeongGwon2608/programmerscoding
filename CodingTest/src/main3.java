import java.util.ArrayList;
import java.util.Arrays;

public class main3 {

	public static void main(String[] args) {
		int k = 4;
		String[] votes = {"AVANT", "PRIDO", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "AVANT", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "SOULFUL", "AVANT", "SANTA"};
		//String[] votes = {"AAD", "AAA", "AAC", "AAB"};
		String answer = solution(2, votes);
		System.out.println("answer : " + answer);
	}
	
	public static String solution(int k, String[] votes) {
		String result = "";
		Arrays.sort(votes);
		
		ArrayList<String> carName = new ArrayList<String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		String temp = "";
		int count = 0;
		
		for(int i=0; i<votes.length; i+=1) {
			if(temp.equals("")) {
				carName.add(votes[i]);
				temp = votes[i];
				count += 1;
			}else if(temp.equals(votes[i])) {
				count += 1;
			}else {
				list.add(count);
				carName.add(votes[i]);
				temp = votes[i];
				count = 1;
			}
		}
		list.add(count);
		
		String[] grade = new String[list.size()];
		for(int i =0; i<grade.length; i+=1) {
			grade[i] = list.get(i) + "_" + carName.get(i);
		}
		Arrays.sort(grade);
		
		System.out.println(Arrays.toString(grade));
		int num = 0;
		
		for(int i=grade.length-1; i>grade.length-1-k; i-=1) {
			num += grade[i].charAt(0)-'0';
		}
		
		int loserNum = 0;
		int i=0;
		
		String[] strTemp = new String[2];
		while(loserNum < num) {
			loserNum += grade[i].charAt(0) - '0';
			i+=1;
			strTemp = grade[i].split("_");
			result = strTemp[1];
		}
		
		return result;
	}

}


