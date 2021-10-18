package book.chapter.one;

public class sort01_1 {
	
	public static void main(String[] args) {
		
		// 연습문제 minValue를 구현하기.
		int min = minValue(5,9,2,13);
		
		System.out.println("최솟값: "+ min);
	}
	
	// 최솟값을 구하는 함수
	public static int minValue(int a, int b, int c, int d) {
		
		int temp = a;
		
		if(b < temp) {
			temp = b;
		}
		if(c < temp) {
			temp = c;
		}
		if(d < temp) {
			temp = d;
		}
		
		return temp;
	}

}
