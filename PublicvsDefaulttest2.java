package AccessModifier;

import AccessModifier_default.PublicvsDefault;

public class PublicvsDefaulttest2 {

	public static void main(String[] args) {
		PublicvsDefault pvd = new PublicvsDefault();
		
		pvd.Public=10;
		//pvd.Default=20;  // 다른 패키지에 있어 접근 불가능
		
		pvd.pubadd();
		//pvd.defadd();
	}

}
