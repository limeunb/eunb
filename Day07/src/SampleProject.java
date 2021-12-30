import java.util.*;

public class SampleProject {

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 String input;
	 
	 while(true) {
		 
		 System.out.print("문자열을 입력해주세요");
		 input = sc.nextLine();
		  System.out.println("나는'"+input+"'입니다");
		  
		  if(input.indexOf("quit")>0){
			  break;
			  // sc.close();
			  
		  }
		 
	 }
	 
	 sc.close();
	 System.out.println("프로그램종료");
	 
	}

}