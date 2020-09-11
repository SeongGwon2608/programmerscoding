//문제명	: 오픈채팅방(Kakao - 2019)
//난이도	: Lv2
//해결일	: 2020.09.09
//블로그	: O

package programmers_Lv2;

import java.util.HashMap;

public class OpenCheating {

	public static void main(String[] args) {
		String[] record = 
			{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		solution(record);
		
	}
	
	public static String[] solution(String[] record) {
		//map을 사용해서 uid, nickName 저장
        HashMap<String, Object> userData = new HashMap<String, Object>();
        
        String[] arrStr = new String[3];
        String[] strTemp = new String[record.length];
        int count = 0;

		for (int i = 0; i < record.length; i += 1) {
			arrStr = record[i].split(" ");
			if (!arrStr[0].equals("Change")) {
				strTemp[count] = arrStr[0] + "_" + arrStr[1];
				count+=1;
			}
			if (!arrStr[0].equals("Leave"))
				userData.put(arrStr[1], arrStr[2]);
		}

		String[] answer = new String[count];

		for (int i = 0; i < count; i += 1) {
			arrStr = strTemp[i].split("_");
			
			switch (arrStr[0]) {
			case "Enter":
				answer[i] = (String) userData.get(arrStr[1]) + "님이 들어왔습니다.";
				break;
			case "Leave":
				answer[i] = (String) userData.get(arrStr[1]) + "님이 나갔습니다.";
				break;
			default:
				break;
			}
		}
      
        return answer;
    }


}
