package book.chapter.two;

import java.util.Arrays;

public class arrangement {
	
	public static void main(String[] args) {
		
//		Arrangement -> 배열  
		
//		자료형[] 변수명 
		int[] arr = new int[3];
		int arr2[] = new int[3];
		
		final int ARRAY_LENGTH = 1;
		
		String[] strings = new String[ARRAY_LENGTH];
		byte[] bytes = new byte[ARRAY_LENGTH];
		short[] shorts = new short[ARRAY_LENGTH];
		int[] ints = new int[ARRAY_LENGTH];
		float[] floats = new float[ARRAY_LENGTH];
		long[] longs = new long[ARRAY_LENGTH];
		double[] doubles = new double[ARRAY_LENGTH];
		boolean[] booleans = new boolean[ARRAY_LENGTH];
		char[] chars = new char[ARRAY_LENGTH];
		
		
		System.out.println("참조 타입의 초기값: "+ strings[0]);
		System.out.println("byte 타입의 초기값: "+ bytes[0]);
		System.out.println("short 타입의 초기값: "+ shorts[0]);
		System.out.println("int 타입의 초기값: "+ints[0]);
		System.out.println("float 타입의 초기값: "+floats[0]);
		System.out.println("long 타입의 초기값: "+longs[0]);
		System.out.println("double 타입의 초기값: "+doubles[0]);
		System.out.println("boolean 타입의 초기값: "+booleans[0]);
		System.out.println("char 타입의 초기값: "+chars[0]);
		
		System.out.println("======================================================");
		
		
		
		int[] array1 = new int[1]; // 1. 선언과 동시에 0으로 초기화
		int[] array2 = new int[] {1,2,3}; // 2. 배열 생성시, 크기를 지정하지 않고 저장할 요소만 명시한다.
		int[] array3 = {1,2,3,4,5}; // 3. 저장할 요소만 명시하는 방법.
		
		System.out.println("array1: "+Arrays.toString(array1)+", length: "+array1.length);
		System.out.println("array2: "+Arrays.toString(array2)+", length: "+array2.length);
		System.out.println("array3: "+Arrays.toString(array3)+", length: "+array3.length);
	}

}
