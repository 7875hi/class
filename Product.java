// 제품 객체
public class Product {
	// 제품가격
	int price;
	
	//생성자
	Product(int price){
		this.price = price;
	}
	
	public String toPrice() {
		return price + "만 원";
	}
	
}
