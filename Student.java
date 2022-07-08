package example;

public class Student {

	//4. 다음과 같은 멤버변수를 갖는 Student클래스를 정의
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	//int sum = kor+eng+math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		float avg = (float)(kor+eng+math)/3;
		return Math.round(avg * 100) / 100.0f;
	}
}
