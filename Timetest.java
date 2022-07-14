package AccessModifier;

public class Timetest {

	public static void main(String[] args) {
		          // 매개변수 3개인 생성자 호출
		Time t = new Time(50,06,56);
		
		//System.out.println(t.hour);
		//System.out.println(t.minute);
		//System.out.println(t.second);
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
	}

}
