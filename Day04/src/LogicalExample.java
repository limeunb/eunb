//������
public class LogicalExample {

	public static void main(String args[]) {

	// AND, OR, XOR, NOT 
		
   // 1. AND ����
   //&, &&  > true&true, true&&true
  //���� ��� ���̾�� ������� ���̴�. 
		
	
		int a = 10, b=15;
		boolean result=(a!=b)&&(a <b);
		System.out.println(result && false);
		//a�� ���̰� b�� ���̸� ���̴� 
		
		int c =10, d=10;
		System.out.println ((c++ == d++)&&(c > d));
		
		
		// && < �ΰ��ΰ��� �տ� �����̸� �ڿ��� �����⿡ ����x
		// &&�� false && true�� ������ ������, false�� ���� ����
		// ���� ������ �� �ʿ� ������ �ٷ� �н� 
		
		// & < �ϳ��ΰ��� �տ� �������� �ڿ� ���� 
		// &�� �� ���ϴ�. false & true 
		
		
		// 2. OR ����
		// |,||
		// �� �� �ϳ��� True�� ������ true
		
		int x = 100, y = 200;
		System.out.println(x!=y || (x++ == y++));
		System.out.println("x="+ x +","+"y="+y);
		
		
		// 3.XOR ����
		// ^
		// ������ �޶�� true / ������ ������ false
		// true ^ true = ? (false)
		// true ^ false = ?(true)
		// false ^ false = ? (false)
		
		
		// 4. NOT
		// !true == false
		// !false == true
		// a!=b
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	