//비교연산
public class CompareExamlpe {

	public static void main(String args[]) {
		
	//비교연산은 참/거짓을 밝히는 연산
	// >,<,>=,<=
	// =같다 (=할당)
	//!= 같지 않다
	// 결과값은 boolean
	
	int a =10, b = 20, c =10;
	

	System.out.println("a > b");
	
	System.out.println("a<b=" +(a<b));
	System.out.println("a>=b="+(a>=b));
	System.out.println("a<=b=" +(a<=b));
	
	boolean result = (a>=b);
	System.out.println(result);
	
	System.out.println("!(a>b)"+!(a>b));
	//!는 not을 의미한다 !false==true !true==false
	
	System.out.printl("a==b"+(a==b)); //false
	//a==b > a 이퀄 b (a와 b가 같은값이냐)
	
	System.out.println("a!=b"+(a!=b)); // true
	// 10과 20은 같지 않기 때문에 진실
	
	
	
	
	
	
	}
	
	
}
