
public class Item {
	//������
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
		total = total + count;	//�߰� - �� ����
	}
	
	//�Ӽ�
	String name;
	String code;
	static String company = "COUPANG";
	static int total = 0;
	int price;
	int count;	//���
	
	//�޼ҵ�
	//å �̸�, �ڵ�, ������ ����ϴ� �޼ҵ�
	void printItem() {
		System.out.println(name + ":" + code + " " + price);
	}
	void printItemCount() {	  //����� ���
		System.out.println(name + ":" + code + " " + price + " ���" + count);
	}
	void sell(int num) {   //num��ŭ �Ǵ�.
		if(num > count) {
			System.out.println(name + "�� ��� �����մϴ�.");
		}
		else {
			System.out.println(name + " " + num + "�� �Ǹ� �Ϸ�");
			count = count - num;
			System.out.println(name + " ��� " + count);
			total = total - num;
		}
	}
	void addItem(int num) {	//num��ŭ ��� �� ä���.
		System.out.println(name + " " + num + "���� ���� �߰�");
		count = count + num;
		printItemCount();
	}
	void printTotal() {
		System.out.println("���� �� ������" + " " + total + "�Դϴ�.");
	}
}
