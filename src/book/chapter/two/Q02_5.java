package book.chapter.two;

import java.util.Scanner;

public class Q02_5 {
	
	public static void main(String[] args) {
		
		
		// 사용자로부터 소문자 알파벳 1개를 입력받아 대문자로 변경하여 출력하는 코드를 작성해 보세요.
		// ex 'a'를 입력받아 'A'로 출력합니다.
		
		// 바로 코드 작성
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String result = a.toUpperCase();
		
		
		System.out.println(result);
		
		sc.close();
	}
}
