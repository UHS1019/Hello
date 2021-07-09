import java.util.Scanner;

public class Day04_사칙연산 {

	public static void main(String[] args) {
		int a, b; 
		char op = '*';
		String opp;
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("A:");	a = sc.nextInt();
			System.out.println("B:");	b = sc.nextInt();
			System.out.println("연산자:");	opp = sc.next();
			
			op = opp.charAt(0);	//문자열 opp에서 0번째 문자 하나만 읽기
			if(opp.equals("+"))	//opp.charAt(0)=='+'
				System.out.println(a + opp + b + "=" + (a+b));
			else if(opp.equals("-")) 
				System.out.println(a + opp + b + "=" + (a-b));
			else if(opp.equals("*")) 
				System.out.println(a + opp + b + "=" + (a*b));
			else if(opp.equals("/"))
				System.out.println(a + opp + b + "=" + (a/b));
			else 
				System.out.println("사칙연산자가 아닙니다.");
			
			switch (op) {
				case '+':
				case '-':
				{
				System.out.println("가감연산");
					break;
				}
				case '*':
				case '/':
				{
				System.out.println("승제연산");
					break;
				}
			}
		}
	}

}
