package inheritance;

public class Overridingtest {

	public static void main(String[] args) {
		//Overriding od = new Overriding();
		//od.x = 10;
		//od.y = 20;
		//System.out.println(od.add());

		OverridingChild od = new OverridingChild();
		od.x = 10;
		od.y = 20;
		od.z = 30;
		System.out.println(od.add());
	}

}
