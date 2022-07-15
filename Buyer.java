// 제품을 사는 사람 객체
public class Buyer {
	// 소유금액
	int money=1000;
	Product[] item = new Product[5]; //객체배열: Product 클래스를 item에 배열로 넣음
	int i=0;  // item 인덱스 값을 i변수에 저장
	int rmoney=0;
	
	// 제품을 사는 기능
	void buy(Product p) {
		System.out.println(p.toString()+"을/를 구입하셨습니다.");
		System.out.println("가격은 "+p.toPrice()+"입니다");
		
		// 내가 가진 금액 = 내가 가진 금액 - 제품가격
		// 소유금액=소유금액(money)-제품가격
		money-=p.price;
		
		item[i++]=p;
		
		rmoney=money+p.price;
	}
	
	void rebuy(Product p) {
		item[i++]=p;
		rmoney=money+p.price;
		
	}
}
