
public class Truck extends Cars{
	//������ �������̵�
	void speedUp() {
		velocity += 5;
		System.out.println(name + " ����ӷ�" + velocity);
	}
	
	public static void main(String[] args) {
		Truck bonggo = new Truck();
		bonggo.speedUp();
		bonggo.speedUp();
		bonggo.speedUp();
	}

}
