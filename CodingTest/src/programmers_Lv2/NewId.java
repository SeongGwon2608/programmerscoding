//문제명	: 신규 아이디 추천(2021 카카오 블라인드)
//난이도	: Lv2
//해결일	: 21.04.03
//블로그	: O

package programmers_Lv2;

public class NewId {

	public static void main(String[] args) {
		String answer = solution("z-+.^.");
		System.out.println("answer : " + answer);
	}

	public static String solution(String new_id) {
        String answer = "";
        String temp = "";
        String temp2 = "";
        
        //1. 소문자로 치환
        new_id = new_id.toLowerCase();
        System.out.println(new_id);
        
        //2. 불필요 문자 제거
        for(int i=0; i<new_id.length(); i+=1) {
        	if(new_id.charAt(i) <= 122 && new_id.charAt(i) >= 97) {
        		temp += new_id.charAt(i);
        	}else if(new_id.charAt(i) <= 57 && new_id.charAt(i) >= 48) {
        		temp += new_id.charAt(i);
        	}else if(new_id.charAt(i) == '-' || new_id.charAt(i) == '_' || new_id.charAt(i) == '.') {
        		temp += new_id.charAt(i);
        	}
        }
        System.out.println(temp);
        
        //3. 연속된 마침표 제거 
        for(int i=0; i<temp.length(); i+=1) {
        	try {
				if(temp.charAt(i) == '.' && temp.charAt(i+1) == '.') {
					continue;
				}
			} catch (Exception e) {}
        	temp2 += temp.charAt(i);
        }
        System.out.println(temp2);
        
        //4. 처음이나 마지막의 마침표는 제거
        temp = "";
        for(int i=0; i<temp2.length(); i+=1) {
        	if(i == 0 && temp2.charAt(i) == '.') {
        		continue;
        	}else if(i == temp2.length()-1 && temp2.charAt(i) == '.') {
        		continue;
        	}
        	temp += temp2.charAt(i);
        }
        System.out.println(temp);
        
        //5. new_id가 빈 문자열이면 a 대입
        if(temp == "") {
        	temp = "a";
        }
        
        //6. new_id가 16자 이상이면 15자를 제외한 문자를 삭제 및 마지막 문자가 .이 되지 않게
        if(temp.length() >=16) {
        	for(int i=0; i<14; i+=1) {
        		answer += temp.charAt(i);
        	}
        	if(temp.charAt(14) != '.') {
        		answer += temp.charAt(14);
        	}
        }else {
        	answer = temp;
        }
        System.out.println(answer);
        
        //7. new_id의 길이가 2자 이하면, new_id의 마지막 문자를 길이가 3이 될때까지 반복
        while(answer.length() < 3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }

}
