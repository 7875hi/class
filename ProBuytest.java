public class ProBuytest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		//Product p = new Computer()
		b.buy(new Computer()); //컴퓨터를 사겠다.
		//Product p = new Tv()
		b.buy(new Tv());  // Tv를 사겠다.
		
		System.out.println("현재 소유한 금액은 "+b.money+"만 원입니다.");
		
		b.rebuy(new Computer());
		b.rebuy(new Tv());
		System.out.println("환불되셨습니다. 현재소유금액은 "+b.rmoney+"만 원입니다.");
	}

}
