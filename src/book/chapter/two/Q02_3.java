package book.chapter.two;

import java.util.Arrays;

public class Q02_3 {
	
	public static void main(String[] args) {
		
		
		// 순서가 없는 두 배열에서 서로 같은 요소를 포함하는지 판별하는 메서드를 작성해 보세요.
		// 출력예시) arr1배열과 arr2배열은 같은 배열입니다.
		
		int[] arr1 = {1,2,3,1};
		int[] arr2 = {2,3,1,1};
		
		// 아래부터 코드 작성
		
		int result = 0;
		
		// 얕은 복사, 깊은 복사 차이를 알아야 한다 !!!!
		int[] temp = arr2.clone();
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if( arr1[i] == temp[j] ) {
					
					temp[j] = 0;
					result++;
					System.out.println(temp[j]);
					break;
				}
				
			}
		}
		if(result == arr1.length) {
			System.out.println("arr1배열"+Arrays.toString(arr1)+", arr2배열은"+Arrays.toString(arr2)+"은 같은 배열 입니다.");
		}
	}
}
