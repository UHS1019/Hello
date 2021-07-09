import java.util.Scanner;

public class Day04_나이 {

	public static void main(String[] args) {
		int year, code;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생년도:");
		year = sc.nextInt();
		System.out.println("성별코드:");
		code = sc.nextInt();
		
		//나이
		System.out.println("당신의 나이는 " +(2021-year + 1) + "세이고 ");
		
		if(code == 1 || code == 3)
			System.out.println("남자입니다.");
		else if(code == 2 || code == 4)
			System.out.println("여자입니다.");
		else
			System.out.println("외계인입니다.");
		

	}

}
