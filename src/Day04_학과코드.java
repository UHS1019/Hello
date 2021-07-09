import java.util.Scanner;

public class Day04_학과코드 {

	public static void main(String[] args) {
		int code;
		Scanner sc = new Scanner(System.in);

		while(true)
		{	
			//안내
			System.out.println("학과코드 입력:");
			//입력
			code = sc.nextInt();
			//판단
			if(code == 1)
				System.out.println("설계과");
			else if(code == 2)
				System.out.println("제어과");
			else if(code == 3)
				System.out.println("시스템과");
			else if(code == 4)
				System.out.println("정보통신과");
			else	
				System.out.println("다시 입력하세요");
		}
	}

}
