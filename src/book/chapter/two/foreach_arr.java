package book.chapter.two;

import java.util.Arrays;

public class foreach_arr {
	
	public static void main(String[] args) {
		
		
		System.out.println("===============================");
		
		int[] students = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("변경 전: " + Arrays.toString(students));
		
		for (int studentNumber : students) {
			System.out.println("학생번호: " + studentNumber);
		}
		
		System.out.println("===============================");
		
		int[] students2 = new int[students.length];
		
		for (int i = 0; i < students.length; i++) {
			students2[(students.length-1) - i ] = students[i];
		}
		
		System.out.println("변경 후: " + Arrays.toString(students2));
		
		
	}

}
