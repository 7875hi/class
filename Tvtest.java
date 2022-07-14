package inheritance;

public class Tvtest {

	public static void main(String[] args) {
	// Tv t = new Tv() : Tv 클래스를 인스턴스 생성
	// new Tv() : Tv클래스의 주소 생성
	// Tv() : 생성자 호출
		// 포함관계
		// Tv t = new Tv();
		CaptionTv t = new CaptionTv();
		
		// Tv 클래스에 있는 channel 변수에 10을 초기화
		t.channel = 10;
		t.channelUp();
		System.out.println(t.channel);
		
		t.displayCaption("자막 봄1");  // 불리언 타입의 기본값은 false
		t.caption = true;            // true 선언 안해주면 if문 실행 안됨
		t.displayCaption("자막 봄2");
	}

}
