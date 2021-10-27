package book.chapter.two;


public class Q02_2 {
	
	public static void main(String[] args) {
		
		// 배열의 최댓값과 최솟값을 구하는 메서드를 작성해 보세요.
		
		int[] arr = {10, 11, 2, 5, 3, 3, 24 ,15, 6, 9};
		
		// 아래부터 코드 작성
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if( min > arr[i]) {
				min = arr[i];
			}
			else if ( max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("최솟값: " + min);
		System.out.println("최댓값: " + max);
	}
}
