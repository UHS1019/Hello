
public class Pizza {
	private int size;
	private String type;
	
	Pizza(){}
	Pizza(String type){
		this.type = type;
	}

	Pizza(int size, String type){
		this(type);
		this.size = size;
	}
	
	void toPrint() {
		System.out.println("종류: " + type + " 크기: " + size);
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
}
