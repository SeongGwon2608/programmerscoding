//������	: �������(Kakao - 2018)
//���̵�	: Lv1
//�ذ���	: 2020.09.02
//��α�	: O

package programmers_Lv1;

import java.util.Arrays;

public class TreasureMap {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		String[] result = solution(arr1, arr2, n);
		System.out.println("����� : " + Arrays.toString(result));

	}
	
	public static String[] solution(int[] arr1, int[] arr2, int n) {
		String[] answer = new String[n];
		String[] map1 = changeNum(arr1, n);
		String[] map2 = changeNum(arr2, n);
		
		for(int i =0; i<n; i+=1) {
			String temp = "";
			for(int j=0; j<n; j+=1) {
				if(map1[i].charAt(j) == '#' || map2[i].charAt(j) == '#')
					temp += "#";
				else
					temp += " ";
			}
			answer[i] = temp;
			System.out.println(Arrays.toString(answer));
		}
		
		return answer;
	}

	//������ �迭�� �Ű������� �޾� ������ ��ȯ��Ű�� �޼���
	private static String[] changeNum(int[] arrNum, int n) {
		String[] result = new String[n];

		for (int i = 0; i < arrNum.length; i += 1) {
			String strResult = "";

			for (int j = 0; j < n; j += 1) {
				if (arrNum[i] <= 0) {
					strResult = "0" + strResult;
				} else {
					strResult = (arrNum[i] % 2) + strResult;
					arrNum[i] /= 2;
				}
			}
			result[i] = createMap(strResult);
			System.out.println(Arrays.toString(result));
		}

		return result;
	}
	
	//��ȣȭ�� ���ڿ��� �Ű������� ���� ����
	private static String createMap(String encMap) {
		String decMap = "";
		
		for(int i=0; i<encMap.length(); i+=1) {
			if(encMap.charAt(i) == '0'){
				decMap += " ";
			}else {
				decMap += "#";
			}
		}
		
		return decMap;
	}

}
