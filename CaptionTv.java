package inheritance;
//자식 클래스   
// CaptionTv extends Tv : 상속관계
             // 자식                 // 부모
public class CaptionTv extends Tv {
	
	// 자막 볼건지(true), 안볼건지(false)
	boolean caption;
	// 자막을 보여주는 기능(메소드)
	void displayCaption(String text) {
		// caption에 저자오디어 있는 값이 true면
		if(caption) {
			// 자막을 보여줘라
			System.out.println(text);
		}
	}

}
