package book.chapter.two;

import java.util.Arrays;

public class array_copy {

	public static void main(String[] args) {
		
		
		String[] folderA = {"myComputer","myDocument"};
		String[] folderB = new String[folderA.length];
		
		
		System.out.println("[사본 배열의 값 변경 전] 원본 배열: "+ Arrays.toString(folderA));
		
		// 배열의 요소들을 각각 저장
		for (int i = 0; i < folderA.length; i++) {
			folderB[i] = folderA[i];
		}
		
		folderB[0] = "newFolder"; // 사본 배열의 첫 번쨰 인덱스 값 변경
		
		System.out.println("[사본 배열의 값 변경 후] 원본 배열: "+Arrays.toString(folderA));
		System.out.println("[사본 배열의 값 변경 후] 사본 배열: "+Arrays.toString(folderB));
		
		// Java에서는 배열 복사를 지원하는 여러 가지 메서드를 제공합니다. (4개)
		// 1. clone()
		// 2. System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		// 	- ( 원본 배열 객체, 원본 배열에서 복사할 시작점, 사본 배열 객체, 사본 배열에서 복사할 시작점, 원본 배열의 요소를 복사할 개수 )
		// 3. Arrays.copyOf(...)
		// 4. Arrays.copyOfRange(...)
		
		
		
	}

}
