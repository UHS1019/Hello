import java.util.Scanner;

public class Day07_��ǰ���� {

	public static void main(String[] args) {
		Item camera = new Item("Canon D40");
		camera.code = "AA-1";
		camera.price = 500000;
		camera.printItem();
		
		Item earphone = new Item("������", "APPLE-2", 290000);
		earphone.printItem();
		
		Item computer = new Item("Samsung notebook", "AVCS-23", 1800000, 100);
		computer.printItemCount();
		//�Ǹż��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����:");
		int num = sc.nextInt();
		computer.sell(num);
		computer.addItem(100);
	}

}
