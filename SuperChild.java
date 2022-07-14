package inheritance;
// 자식 클래스
public class SuperChild extends Super{
	
	int x = 20;
	
	void method() {
		
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);  // 자식클래스 x
		System.out.println("super.x="+super.x);// 부모클래스 x
		
	}

}
