
public class Day07_��ǰ����3 {

	public static void main(String[] args) {
		Item computer = new Item("LG", "ZXZXAS", 10000, 10);
		computer.printTotal();
		Item speaker = new Item("BOSS", "ZZXXAS", 30000, 20);
		speaker.printTotal();
		//������ �ȸ� total�� �پ��� 
		speaker.sell(5);
		speaker.printTotal();  //25�� ��������
		speaker.sell(3);
		speaker.printTotal();  //22�� ��������
		speaker.sell(20);
		speaker.printTotal(); 
	}
	
}
