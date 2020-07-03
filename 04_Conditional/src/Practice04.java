import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		/*
		 *  switch~case
		 *  회원 등급에 따라 권한 부여하기
		 *  
		 *  3급 - 읽기, 쓰기, 삭제
		 *  2급 - 읽기, 쓰기
		 *  1급 - 읽기
		 *  
		 *  	[출력결과]
		 *  	당신의 회원등급을 입력해주세요 : 2
		 *  	읽기권한부여
		 *  	쓰기권한부여
		 */
		
		int		grade	= 0;
		String	str1	= "읽기";
		String	str2	= "쓰기";
		String	str3	= "삭제";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 회원등급을 입력해주세요 : ");
		grade = sc.nextInt();
		
		switch(grade)
		{
		case 3:
			System.out.printf("%s 권한부여\n",str3);
		case 2:
			System.out.printf("%s 권한부여\n",str2);
		case 1:
			System.out.printf("%s 권한부여\n",str1);
			break;
		}
		
	}

}
