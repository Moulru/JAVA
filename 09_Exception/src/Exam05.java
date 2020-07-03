
public class Exam05 {
	public static void main(String[] args) {
		/*
		 * 	예외 클래스 직접 만들기
		 * 		- 기존에 작성된 예외클래스를 상속받아서 클래스 정의하기
		 * 
		 * 		- 프로그램 설치파일 소스코드	--> 실제 대부분의 설치파일은 이런 구조임
		 * 			1. 설치파일 시작
		 * 			2. 설치파일 안에 들어있는 실제 파일들을 임시경로에 압축해제
		 * 			3. 임시경로의 파일들을 하나씩 실제 설치경로로 이동 (복사)
		 * 			4-1. 모든 파일들이 정상적으로 복사됨	-->	5로 바로 이동
		 * 			4-2. 중간에 문제가 발생함				-->	예외처리
		 * 				> PC 저장공간 부족
		 * 				> PC 메모리 부족
		 * 			5. 임시경로의 파일들 제거
		 */

		// 프로그램의 시작 = main() 메서드 시작
		// if문, for문 같은 제어문 / 메서드 등등 사용을 한다해도
		// main() 부터 흐름을 따라가면 코드를 읽을 수 있다
		
		
		try {
			// 설치 가능한 상태인지 확인
			checkSystem();
			
			// 설치가 가능하다면 파일을 복사
			copyFiles();
			
			// 설치끝
			
		} catch (SpaceException e) {
			System.out.println("[설치에러 발생]");
			System.out.println("메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("저장공간 확보 후 다시 시도해주세요.");
			
		} catch (MemoryException e) {
			System.out.println("[메모리에러 발생]");
			System.out.println("메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("메모리 확보 후 다시 시도해주세요.");
		} catch (Exception e) {
		} finally {
			System.out.println("임시파일 삭제");
			System.out.println("설치 프로그램 종료");
		}
		
	}	// main() 끝
	
	// 설치 가능한지 시스템 체크
	static void checkSystem() throws SpaceException, MemoryException {
		if( checkSpace() == false ) {
			// 저장공간이 없으니까 여기서 예외 발생!
			System.out.println("저장공간 부족");
			throw new SpaceException("저장공간부족");
		}
		
		if( checkMemory() == false ) {
			// 메모리가 부족해서 여기서 예외 발생!
			System.out.println("메모리 부족");
			throw new MemoryException("메모리부족");
		}
	}
	
	// 저장공간 체크 메서드
	static boolean checkSpace() {
		return true;
//		return false;
	}
	
	static boolean checkMemory() {
//		return true;
		return false;
	}
	
	static void copyFiles() {
		System.out.println("파일 복사 성공!");
	}
}

// 특정 오류에 대한 클래스를 만듬! ArrayIndexOutOfBoundsException 이런 것들과 같이

// 저장공간 부족 시 인스턴스 생성할 클래스
class SpaceException extends Exception {
	SpaceException( String msg ) {
		super(msg);	// Exception의 생성사(String msg)를 호출
	}
}

// 메모리 부족 시 인스턴스 생성할 클래스
class MemoryException extends Exception {
	MemoryException( String msg ) {
		super(msg);
	}
}