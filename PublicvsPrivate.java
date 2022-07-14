package AccessModifier;

public class PublicvsPrivate {
	
	// 접근 제어자가 public인 변수
	public int Public;
	
	// 접근 제어자가 private인 변수
	private int Private;
	
	// 접근 제어자가 public인 메서드
	public void pubadd() {
		
	}
	
	// 접근 제어자가 private인 메서드
	private void priadd() {
		Private = 10;  // 같은 클래스에서는 사용 가능
	}
}
