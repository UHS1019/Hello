
public class Day04_매개변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(args[0]);  
		System.out.println(args[1]); 
		int a, b;
		a = Integer.parseUnsignedInt(args[0]);	//문자열을 숫자로 변환하는 방법
		b = Integer.parseUnsignedInt(args[1]);	//문자열을 숫자로 변환하는 방법
		
		System.out.println("문자열:" + args[0] + args[1]);
		System.out.println("숫자:" + (a+b));
	}

}
