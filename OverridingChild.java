package inheritance;

public class OverridingChild extends Overriding{
	
	int z;
// 오버라이딩 : 부모클래스의 메소드가 마음에 들지 않아 
// 자식 클래스에서 상속받은 메소드 내용을 변경하는 것	
	// 조건1. 메소드 이름과 같아야 함
	// 조건2. 매개변수가 같아야 함
	// 조건3. 리턴타입이 같아야 함
	@Override
	int add() {
		return x+y+z;
	}
}
