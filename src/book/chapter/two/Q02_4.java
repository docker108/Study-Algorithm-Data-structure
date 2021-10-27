package book.chapter.two;

import java.util.Arrays;

public class Q02_4 {
	
	public static void main(String[] args) {
		
		
		// 중복 요소를 제거한 새 배열을 반환하는 메서드를 작성해 보세요.
		// 중복 제거된 빈 요소는 기본값 0으로 삽입됩니다.
		
		int[] arr = {5, 10, 9, 27, 2, 8, 10, 4, 27, 1};
		int[] result = new int[10];
		
		// 아래부터 코드 작성
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = 0;
					break;
				}
			}
			
		}
		result = arr;
		System.out.println(Arrays.toString(result));
	}
}
