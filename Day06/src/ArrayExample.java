
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
		
	}
}
