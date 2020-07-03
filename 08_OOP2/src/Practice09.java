public class Practice09 {
	public static void main(String[] args) {
		/*
		 * 	Device09
		 * 		추상클래스
		 * 		getId() 추상메서드
		 * 		String deviceId
		 */
		Device09 myPhone = new Phone09("ID-1234");
		Device09 myTv	 = new Tv09("ID-5678");
		
		System.out.println("phone ID : " + myPhone.getId());
		System.out.println("tv ID : " + myTv.getId());
	}
}

abstract class Device09 {
	String deviceId;
	abstract String getId();
}

class Phone09 extends Device09 {
	
	Phone09(String id) {
		super.deviceId = id;
	}
	
	@Override
	String getId() {
		return super.deviceId;
	}
}

class Tv09 extends Device09 {
	
	Tv09(String id) {
		super.deviceId = id;
	}
	
	@Override
	String getId() {
		return super.deviceId;
	}
}