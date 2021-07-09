
public class Item {
	//생성자
	Item(String name){
		this.name = name;
	}
	
	Item(String name, String code, int price){
		this.name = name;
		this.code = code;
		this.price = price;
	}
	
	Item(String name, String code, int price, int count){
		this.name = name;
		this.code = code;
		this.price = price;
		this.count = count;
		total = total + count;	//추가 - 총 개수
	}
	
	//속성
	String name;
	String code;
	static String company = "COUPANG";
	static int total = 0;
	int price;
	int count;	//재고량
	
	//메소드
	//책 이름, 코드, 가격을 출력하는 메소드
	void printItem() {
		System.out.println(name + ":" + code + " " + price);
	}
	void printItemCount() {	  //재고량도 출력
		System.out.println(name + ":" + code + " " + price + " 재고" + count);
	}
	void sell(int num) {   //num만큼 판다.
		if(num > count) {
			System.out.println(name + "의 재고가 부족합니다.");
		}
		else {
			System.out.println(name + " " + num + "개 판매 완료");
			count = count - num;
			System.out.println(name + " 재고량 " + count);
			total = total - num;
		}
	}
	void addItem(int num) {	//num만큼 재고를 더 채운다.
		System.out.println(name + " " + num + "개의 수량 추가");
		count = count + num;
		printItemCount();
	}
	void printTotal() {
		System.out.println("현재 총 물량은" + " " + total + "입니다.");
	}
}
