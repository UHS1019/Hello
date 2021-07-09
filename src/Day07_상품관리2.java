
public class Day07_상품관리2 {

	public static void main(String[] args) {
		Item phone = new Item("Note9", "AABBCC", 200000, 100);
		phone.printItem();
		
		Item mouse = new Item("Logitech", "ZZZXXX", 10000, 200);
		mouse.printItemCount();
		System.out.println(mouse.company);
		
		phone.company = "SAMSONG";
		System.out.println(phone.company);
		
		System.out.println(mouse.company);
	}

}
