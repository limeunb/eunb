// 접근제한(한정)자
// public > protected > (default) > private
// 사용방법
// 1. 멤버(속성) 변수에 사용 가능
// ex) public int age; [접근제한자] 데이터 타입 변수명;
// 2. 클래스에 사용 가능
// ex) class Person [전급제한자] class 클래스명 
// 3. 메서드에 사용 가능
// ex) int plus (int x, int y) [접근제한자] 리턴타입 메서드명 (매개변수)
import kr.education.*;

public class AccessExample {

	public static void main (String[] args) {
		Student std1 = new Student();
		// 동일 패키지 내에 de
		std1.name = " 하악하악";
		std1.grade = 10;
		std1.printMySelf();
		
		// 다른 패키지에 퍼블릭 클래스라서 참조 가능
		StudentDefault std2 = new StudentDefault();
        // StudentDefault 클래스 name 속성은 public 이라 참조 가능
	//	std2.name ="김종석";
		// 다른 패키지의 default 속성이라 참조할 수 없다 (에러)
	}


}