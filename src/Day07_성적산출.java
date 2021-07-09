import java.util.Scanner;

public class Day07_성적산출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명 학생들의 성적을 입력받아서 배열에 저장하고,
		// 합계와 평균을 계산하여 출력하는 프로그램을 작성해보자
		
		int score[] = new int[5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			System.out.println("성적 입력:");
			score[i] = sc.nextInt();
			sum = sum + score[i];	// sum += score[i];
		}
		System.out.println("합계:" + sum);
		//avg = sum / 5.0;
		avg = (double)sum / 5;
		
		//System.out.print("평균:" + avg);
		System.out.printf("평균:%.2f" , avg);
	}

}
