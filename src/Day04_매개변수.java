
public class Day04_�Ű����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(args[0]);  
		System.out.println(args[1]); 
		int a, b;
		a = Integer.parseUnsignedInt(args[0]);	//���ڿ��� ���ڷ� ��ȯ�ϴ� ���
		b = Integer.parseUnsignedInt(args[1]);	//���ڿ��� ���ڷ� ��ȯ�ϴ� ���
		
		System.out.println("���ڿ�:" + args[0] + args[1]);
		System.out.println("����:" + (a+b));
	}

}
