import java.util.Arrays;
import java.util.Collections;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 * 	배열을 다루는 Arrays 클래스
		 * 		- 유용한 기능이 많다!
		 */
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); 	// {1,2,3,4,5}
		int[] arr3 = Arrays.copyOf(arr1, 2);				// {1,2}
		int[] arr4 = Arrays.copyOf(arr1, 8);				// {1,2,3,4,5,0,0,0}
		int[] arr5 = Arrays.copyOfRange(arr1, 1, 4);		// {2,3,4}
														// 끝 인덱스는 포함되지 않는다
		int[] arr6 = Arrays.copyOfRange(arr1, 1, 8);		// {2,3,4,5,0,0,0}
		
		printArr(arr1, "1번");
		printArr(arr2, "2번");
		printArr(arr3, "3번");
		printArr(arr4, "4번");
		printArr(arr5, "5번");
		printArr(arr6, "6번");

		// 배열에 특정 값 채우기
		Arrays.fill(arr6, -1);
		printArr(arr6, "6번 값 채움");
		
		// 배열에 값 정렬하기
		Arrays.sort(arr4);
		printArr(arr4, "4번 값 정렬");
		
		// 문자열 배열 정렬
		String[] str = { "kroea" , "Japan" , "china" , "USA" };
		Arrays.sort(str);	// 기본 오름차순 정렬 + 기본 대문자 먼저
		System.out.println( Arrays.toString(str) );
		
		Arrays.sort(str , String.CASE_INSENSITIVE_ORDER);	// 기본 오름차순 정렬 + 대소문자 구별 X
		System.out.println( Arrays.toString(str) );
		
		Arrays.sort(str , Collections.reverseOrder());	// 내림차순 정렬 + 소문자 먼저
		System.out.println( Arrays.toString(str) );
		
		Arrays.sort(str , Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));	// 내림차순 정렬 + 대소문자 구별 X
		System.out.println( Arrays.toString(str) );
		
	}

	static void printArr(int[] arr, String name) {
		System.out.print( name + " 배열 출력 : " );
		for( int i=0; i< arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		
		System.out.println();
	}
	
}
