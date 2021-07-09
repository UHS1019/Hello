
public class Day03_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[3];
		str[0] = "Hello";
		str[1] = "Java";
		str[2] = "World";
		
		for(int i = 0; i < str.length; i++)
			System.out.println(str[i]);
			
		System.out.println("참조형변수 연습=====");
		int a[] = new int[3];
		int b[] = new int[] {11, 22, 33};
		
		a = b;
		a[0] = 99;
		
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		for(int i = 0; i < b.length; i++)
			System.out.println(b[i]);
			
	}

}
