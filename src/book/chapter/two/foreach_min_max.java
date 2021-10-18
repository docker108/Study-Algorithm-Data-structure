package book.chapter.two;

import java.util.Random;

public class foreach_min_max {
	
	public static void main(String[] args) {
		
		// min, max 구하기
		Random rd = new Random();
		final int ARRAY_LENGTH = 100;
		
		int min = 0;
		int max = 0;
		
		int[] arr = new int[ARRAY_LENGTH];
		
		// arr[]에 값 넣어주기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
		}
		
		for (int i : arr) {
			
			if(min > i) {
				min = i;
			}else if(max < i) {
				max = i;
			}
		}
		System.out.println("최솟값: " + min);
		System.out.println("최댓값: " + max);
		
	}
}
