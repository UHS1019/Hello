import java.util.Scanner;

public class Day04_��Ģ���� {

	public static void main(String[] args) {
		int a, b; 
		char op = '*';
		String opp;
		
		//�Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("A:");	a = sc.nextInt();
			System.out.println("B:");	b = sc.nextInt();
			System.out.println("������:");	opp = sc.next();
			
			op = opp.charAt(0);	//���ڿ� opp���� 0��° ���� �ϳ��� �б�
			if(opp.equals("+"))	//opp.charAt(0)=='+'
				System.out.println(a + opp + b + "=" + (a+b));
			else if(opp.equals("-")) 
				System.out.println(a + opp + b + "=" + (a-b));
			else if(opp.equals("*")) 
				System.out.println(a + opp + b + "=" + (a*b));
			else if(opp.equals("/"))
				System.out.println(a + opp + b + "=" + (a/b));
			else 
				System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
			
			switch (op) {
				case '+':
				case '-':
				{
				System.out.println("��������");
					break;
				}
				case '*':
				case '/':
				{
				System.out.println("��������");
					break;
				}
			}
		}
	}

}
