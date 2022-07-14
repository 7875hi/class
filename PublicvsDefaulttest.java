package AccessModifier;


public class PublicvsDefaulttest {

	public static void main(String[] args) {
		PublicvsDefault pvd = new PublicvsDefault();
		
		pvd.Public=10;
		pvd.Default=20;  // 같은 패키지에 있어 접근 가능
		
		pvd.pubadd();
		pvd.defadd();
	}

}
