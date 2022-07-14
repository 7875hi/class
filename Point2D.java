package inheritance;
// 부모클래스
public class Point2D {
	
	int x;
	int y;
	
	Point2D(int x, int y){  // 생성자는 상속 X
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "x : " + x + "y : " + y;
	}

}
