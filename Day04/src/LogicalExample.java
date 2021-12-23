//논리연산
public class LogicalExample {

	public static void main(String args[]) {

	// AND, OR, XOR, NOT 
		
   // 1. AND 연산
   //&, &&  > true&true, true&&true
  //양쪽 모두 참이어야 결과값이 참이다. 
		
	
		int a = 10, b=15;
		boolean result=(a!=b)&&(a <b);
		System.out.println(result && false);
		//a가 참이고 b가 참이면 참이다 
		
		int c =10, d=10;
		System.out.println ((c++ == d++)&&(c > d));
		
		
		// && < 두개인것은 앞에 폴스이면 뒤에도 폴스기에 실행x
		// &&은 false && true의 수식이 있을때, false를 먼저 만나
		// 뒤의 수식은 볼 필요 없으로 바로 패스 
		
		// & < 하나인것은 앞에 폴스여도 뒤에 실행 
		// &은 다 봅니다. false & true 
		
		
		// 2. OR 연산
		// |,||
		// 둘 중 하나가 True면 무조건 true
		
		int x = 100, y = 200;
		System.out.println(x!=y || (x++ == y++));
		System.out.println("x="+ x +","+"y="+y);
		
		
		// 3.XOR 연산
		// ^
		// 양쪽이 달라야 true / 양쪽이 같으면 false
		// true ^ true = ? (false)
		// true ^ false = ?(true)
		// false ^ false = ? (false)
		
		
		// 4. NOT
		// !true == false
		// !false == true
		// a!=b
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	