package AccessModifier;

public class PublicvsPrivatetest {

	public static void main(String[] args) {
		PublicvsPrivate pvp = new PublicvsPrivate();
		
		pvp.Public=10;
		//pvp.Private=20;  // 다른 클래스에서는 사용 불가능
		
		pvp.pubadd();
		//pvp.priadd();
	}

}
