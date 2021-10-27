package book.chapter.two;

import java.util.Arrays;

public class twoD_array {
	
	public static void main(String[] args) {
		
		// 2D Array: 2차원 배열
		
		int[][] array = { // 선언과 동시에 초기화
				{1,2,3},
				{4,5,6},
				{7,8}
		};
		
		System.out.println(array);
		System.out.println(array[0]);
		System.out.println(array[0][0]);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("array크기: " + array.length);
		
		
		
	}

}
