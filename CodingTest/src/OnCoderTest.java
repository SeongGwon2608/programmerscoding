import java.util.Arrays;

public class OnCoderTest {

	public static void main(String[] args) {
		int[] arr = {15, 143, 167};
		solution(arr);
	}

    public static int[] solution(int[] arr){
    	String[] str = new String[arr.length];	
    	int[] answer = new int[arr.length];
    	
    	//사전식 정렬을 위해 문자열 배열로 형변환
    	for(int i=0; i<arr.length; i+=1) {
    		str[i] = arr[i]+"";
    	}
    	Arrays.sort(str);
    	//System.out.println(Arrays.toString(str));
    	
    	for(int i=0; i<arr.length; i+=1) {
    		try {
    			answer[i] = Integer.parseInt(str[i]);
			} catch (Exception e) {
				System.err.println("형변환 오류발생");
			}
    	}
    	System.out.println(Arrays.toString(answer));
        return answer;
    }
    
}
