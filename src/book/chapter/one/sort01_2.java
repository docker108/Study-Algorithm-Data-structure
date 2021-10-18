package book.chapter.one;

public class sort01_2 {
	
	public static void main(String[] args) {
		
		// 연습문제 maxValue를 구현하기.
		int max = maxValue(20,31,15,31,7);
		
		System.out.println("최댓값: "+ max);
	}
	
	// 최댓값을 구하는 함수
	private static int maxValue(int a, int b, int c, int d, int e) {

		int[] arr = {a,b,c,d,e};
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > temp) {
				temp = arr[i];
			}
		}
		
		
		return temp;
	}

}
