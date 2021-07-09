
/**
 * @author robot
 *
 */
public class Item2 {
	private int no;
	private String name;
	private int price;
	private int count;
	private static final String company = "��� ȸ��";
	private static int itemCnt;
	
	Item2(){
		itemCnt++;
	}
	Item2(int no, String name){
		this();
		this.no = no;
		this.name = name;
	}
	Item2(int no, String name, int price, int count){
		this(no, name);
		this.price = price;
		this.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getItemCnt() {
		return itemCnt;
	}
	public static void setItemCnt(int itemCnt) {
		Item2.itemCnt = itemCnt;
	}
	public static String getCompany() {
		return company;
	}
	
	void printInfo() {
		System.out.println("��ǰ�ڵ�: " + no + " ��ǰ��: " + name + " ��ǰ����: " + price + " ��ǰ����: " + count);
	}
	
	void inStore(int cnt) {
		count += cnt;		//count = count + cnt;
							//this.count = this.count + cnt;
		System.out.println("�԰�: " + name + ", " + cnt + "��");
	}
	
	void outStore(int cnt) {
		if(cnt <= count){	//������ ��
			count = count - cnt;
			System.out.println("���: " + name + ", " + cnt + "��");
		}
		else {				//�Ұ���
			System.out.println("������: " + name + ", " + "������� " + count + "��");
		}
	}
	
}
