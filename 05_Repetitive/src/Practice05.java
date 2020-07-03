import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/*
		 * 		숫자를 입력받아서
		 * 		1: 1st
		 * 		2: 2nd
		 * 		3: 3rd
		 * 		그외 : 6th
		 * 		0이하 : "다시입력하세요"
		 * 
		 * 	do~while과 switch~case의 콜라보
		 */

		Scanner sc = new Scanner(System.in);
		
		int inNum = 0;
		

		do {
			System.out.print("숫자를 입력하세요 : ");
			inNum = sc.nextInt();
			if (inNum >= 0) {
				switch (inNum) {
				case 1:
					System.out.printf("%d: %dst\n", inNum, inNum);
					break;
				case 2:
					System.out.printf("%d: %dnd\n", inNum, inNum);
					break;
				case 3:
					System.out.printf("%d: %drd\n", inNum, inNum);
					break;
				default:
					System.out.printf("%d: %dth\n", inNum, inNum);
					break;
				}
				break;
			}
			else if (inNum < 0) {
				System.out.println("다시입력하세요.\n");
			}
		} while (true);

	}
}
