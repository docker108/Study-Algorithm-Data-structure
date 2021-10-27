package book.chapter.two;

import java.util.Arrays;

public class decimal {
	public static void main(String[] args) {
		
		// decimal -> 소수
		// decimal 구하기
		
		final int ARRAY_LENGTH = 10;
		
		int[] arr = new int[ARRAY_LENGTH];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			// 소수를 찾기 위한 check
			boolean check = true;
			
			// 1은 소수가 아니므로 패스
			if( i == 1) {
				continue;
			}
			
			// 2는 소수이므로 배열에 넣어주고 다음 진행
			else if( i == 2) {
				arr[i] = i;
				continue;
			}
			// 2초과부터 나머지가 0으로 나오면 소수가 아니므로 check를 통해 분류 
			for (int j = 2; j < i; j++) {
				if( i % j == 0) {
					check = false;
					break;
				}
			}
			if(check) {
				arr[i] = i;
			}
			
		}
		
		for (int i : arr) {
			if(i > 0) {
				System.out.print(i+" ");
			}
		}
		
		
	}
}
