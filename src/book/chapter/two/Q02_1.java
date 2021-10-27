package book.chapter.two;

import java.util.Scanner;

public class Q02_1 {
	
	public static void main(String[] args) {
		
		// 5개의 양수를 입력받은 배열의 모든 요소의 합을 구하는 메서드를 작성해 보세요.
		
		int[] arr = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// 아래부터 코드 작성
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		
		sc.close();
		
		System.out.println(sum);
	}
}
