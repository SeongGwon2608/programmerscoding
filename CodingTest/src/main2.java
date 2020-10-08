import java.util.Arrays;
import java.util.Comparator;

public class main2 {

	public static void main(String[] args) {
		//int[][] edges = {{0,2},{2,1},{2,4},{3,5},{5,4},{5,7},{7,6},{6,8}};
		
		int[][] edges = {{5,7},{0,2},{2,4},{7,6},{5,4},{2,1},{6,8},{3,5}};
		int[] answer = solution(9, edges);
		System.out.println("answer : " + Arrays.toString(answer));
	}
	
	public static int[] solution(int n, int[][] edges) {
		int[] answer = new int[2];
		int count = n/3;
		
		//0번 인덱스 기준 정렬
		int[][] sortArr = edgesSort(edges);
		
		int[] temp = sortArr[count - 1];
		answer[0] = searchNode(edges, temp);
		
		temp = sortArr[count * 2 - 1];
		answer[1] = searchNode(edges, temp);
		
		return answer;
	}
	
	private static int[][] edgesSort(int[][] edges){
		// 0번 인덱스 기준 정렬
		Arrays.sort(edges, new Comparator<int[]>() {
			@Override
			public int compare(int[] arrSort1, int[] arrSort2) {
				return arrSort1[0] - arrSort2[0];
			}
		});
		return edges;
	}
	
	private static int searchNode(int[][] edges, int[] temp) {
		for(int i=0; i<edges.length; i+=1) {
			if(edges[i].equals(temp))
				return i;
		}
		return 0;
	}

}
