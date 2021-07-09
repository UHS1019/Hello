import java.util.Scanner;

public class Day03_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		a = 1;
		b = 2;
		System.out.println(a > b);
		
		//숫자를 입력받고 홀짝을 구별하여 출력
		// 3: 홀수
		// 4: 짝수
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("숫자 입력:");
			int num = sc.nextInt();
			if(num %2 == 0)
				System.out.println(num + ": 짝수");
			else
				System.out.println(num + ": 홀수");
		}
	}

}
