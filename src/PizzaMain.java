
public class PizzaMain {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		p1.setSize(12);
		p1.setType("슈퍼스프림");
		p1.toPrint();
		p1.setSize(24);
		p1.setType("슈퍼스프림 새우");
		p1.toPrint();
	}

}
