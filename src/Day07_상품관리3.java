
public class Day07_상품관리3 {

	public static void main(String[] args) {
		Item computer = new Item("LG", "ZXZXAS", 10000, 10);
		computer.printTotal();
		Item speaker = new Item("BOSS", "ZZXXAS", 30000, 20);
		speaker.printTotal();
		//물건을 팔면 total도 줄어들게 
		speaker.sell(5);
		speaker.printTotal();  //25가 나오도록
		speaker.sell(3);
		speaker.printTotal();  //22가 나오도록
		speaker.sell(20);
		speaker.printTotal(); 
	}
	
}
