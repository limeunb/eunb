
public class ArrayExample {

	public static void main(String[]args) {
		
		// 배열
		// 값의 집합
		// 변수선언법
		// 데이터타입 변수명[갯수] or 데이터타입[갯수]변수명 
		//int a[10];
		
		
		int[]a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i =0;i<5;i++) {
			a[i]=i;
			
		}
		//a[5]=10; // Array out of bound exception
		
		// 자바 에러는 크게 두개가 있음 인셉견: 프로그램이 날라갈 정도는 아니지만 실수를 할 때 : 런타임 입센션 > 실행할 때만 알 수 있는 에러
		
		
		int[]b= {1,2,3,4,5};
		for(int i=0; i < b.length; i++) {
			System.out.println(i+1);
		}
	
	         //배열정리
			//1. 같은 데이터 타입을 가지는 연속적인 방
		   // int[5] → 4*5 = 20bytes
			
			// 배열 선언법 
			// int[] 변수명;   < 준비! (아직 시작은 안했음)
		    // char[] 변수명;  
			
			// 배열 선언과 동시에 방 만들기
		    // char[] 변수명 = new char[5];
			// 값넣기a : a[0] = 97; a[1]=98............
			// 값넣기b : for문 같은 반복문 사용하는 것
		
			char[] alpha = new char[26];
			
			char alpha_start = 'A';
			
			for(int i =0; i < alpha.length; i++) {
				alpha[i] = alpha_start ++;
			}
			for(int i =0; i < alpha.length; i++){
			System.out.println(alpha[i]);
		}
		
			//-- 배열 선언과 동시에 값 때려 넣기
			// 데이터 타입 배열변수명 ={값};
			 
			char[]arrCh= {97,98,99};
			
			// 	char[]arrCh= {97,98,99}; 97,98,99 등 하나하나 쳐야 한다는 번거로움이 있음 위에 방식이 간편 
			
			
			
			
			
			
	}
}
