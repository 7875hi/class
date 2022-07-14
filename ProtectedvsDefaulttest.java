package AccessModifier;

import AccessModifier_default.ProtectedvsDefault;

public class ProtectedvsDefaulttest extends ProtectedvsDefault {

	public static void main(String[] args) {
		ProtectedvsDefaulttest pvd = new ProtectedvsDefaulttest();
		
		pvd.Protected=10;  // 패키지 연결하고 클래스 상속 시키면 접근 가능
		//pvd.Default=20;  // 다른 패키지에 있어 접근 불가능
		pvd.proadd();
		//pvd.defadd();

	}

}
