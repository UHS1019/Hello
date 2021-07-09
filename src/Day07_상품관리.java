import java.util.Scanner;

public class Day07_상품관리 {

	public static void main(String[] args) {
		Item camera = new Item("Canon D40");
		camera.code = "AA-1";
		camera.price = 500000;
		camera.printItem();
		
		Item earphone = new Item("에어팟", "APPLE-2", 290000);
		earphone.printItem();
		
		Item computer = new Item("Samsung notebook", "AVCS-23", 1800000, 100);
		computer.printItemCount();
		//판매수량 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("수량:");
		int num = sc.nextInt();
		computer.sell(num);
		computer.addItem(100);
	}

}
