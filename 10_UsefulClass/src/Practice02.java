public class Practice02 {

	public static void main(String[] args) {
		/*
		 * 	문자열 파싱하기(parsing)
		 * 		파일의 전체 경로에서 경로와 파일명으로 분리
		 * 
		 * 		>>> 실무 중 정말 많이 함! 중요 
		 */

		String fileFullPath = "C:/test/정리.txt";
		String path = "";
		String fileName = "";
		
//		여기에 코드를 작성해서 path와 fileName의 값을 만들기 (pdf파일 참고)
		
		/*
		 * [다른 방법]
		 * 
		 * int index = fileFullPath.lastIndexOf('/');
		 * Systme.out.println(index);
		 * 
		 * path = fileFullPath.substring(0, index+1);			// +1을 하지않으면 맨마지막 '/'가 빠짐
		 * fileName = fileFullPath.substring( index+1 );		// +1을 하지않으면 '/'가 붙은상태로 파일명이 같이나옴 (/정리.txt)
		 * 
		 * [+예외처리]
		 *	if ( index < 0) {
		 *		Systme.out.println("해당되는 문자를 못찾았음");
		 *	}
		 *	else {
		 *		// index를 찾았으면 밑에있는 문자열 파싱하는 코드가 여기 삽입됨
		 *	}
		 */
		
		String[] fileArr = fileFullPath.split("/");
		
		for(int i=0; i<(fileArr.length)-1;i++) {
			path += fileArr[i] + "/";
		}
		
		fileName = fileArr[fileArr.length-1];
		
		System.out.println(fileFullPath);		// C:/test/정리.txt
		System.out.println(path);				// C:/test/
		System.out.println(fileName);			// 정리.txt
	}
}