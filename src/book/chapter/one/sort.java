package book.chapter.one;

public class sort {
	
	public static void main(String[] args) {
		
		// 정렬 알고리즘 사용
		// 오름차순
		
		int data1 = 3;
		int data2 = 1;
		int data3 = 9;
		int data4 = 5;
		int data5 = 10;
		
		
		// 최솟값 구하는 과정.
		
		// min 변수를 선언하고 data1의 값으로 할당
		int min = data1;
		
		// 조건문을 통해 각각의 데이터들을 모두 비교하여 min보다 작을 경우 min 변수에 재할당해 주어 다시 조건문을 진행함.
		if(data2 < min) {
			min = data2;
		}
		
		if(data3 < min) {
			min = data3;
		}
		if(data4 < min) {
			min = data4;
		}
		if(data5 < min) {
			min = data5;
		}
		
		System.out.println("최솟값 : " + min);
		
		
		// 하지만 위와 값은 코드는 최솟값을 구해야할 데이터가  ....~ n개일 경우 가독성이 좋지 않은 코드가 됨. 
	}

}
