package inheritance;
// 자식크래스
public class Point3D extends Point2D {
	
	int z;
	
	Point3D(int x, int y, int z){  // 생성자는 상속 X
		//super();  // 기본 생성자 상속 받은거임
		super(x,y);  // 부모클래스의 생성자, 무조건 첫번째줄에 있어야 함
		this.z=z;
		
		//this.z=z;
		//super(x,y);  -> 순서 이렇게 되면 오류
	}
	
	String getLocation() {  // 오버라이딩
		return "x : " + x + ", y : " + y + ", z : " + z;
	}

}
