
public class MathExamlpe {

	 // 산술연산
	public static void main(String args[]) {
	
		// +,-,*,/,%
		
		int a = 10;
		int b =20;
		
	
		
		System.out.println(a+b+a+b+b); // 덧셈
		// 변수 사용시 a(4bytes)+b(4bytes) = 8바이트 (이게 효율적)
		
		
	
		// System.out.println(10+20+10+20+20);
		// -- 토탈 사용 바이트는 4*5=20바이트 
		
		
		System.out.println(a-b); // 뺄셈 = -10
		
		System.out.println(a*b); // 곱셉 = 200
		
		System.out.println("a/b="+(a/b));  
		// 나눗셈 (계산하면 0.5지만  > 기본 정수형은 int(인티져)이기 때문에 0을 출력한다)
		
		
		int c = 15;
		System.out.println("c%a="+(c% a));
		
		
		
	}
	
}
