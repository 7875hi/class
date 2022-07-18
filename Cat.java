package Interface;

public class Cat implements Animal {
	
	public void cry() {  // 무조건 인터페이스에 있는 추상메소드를 구현해줘야 함
		// 고양이가 운다.
		System.out.println("야옹");
	}

}
