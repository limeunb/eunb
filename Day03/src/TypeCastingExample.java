
public class TypeCastingExample {

	
	 public static void main(String[] args) {
		 // ������ ������ Ÿ�� (38p)
		 // (short)�� ������ ���� ����, ����� ����ȯ
		 int a= 10; // 4 bytes
		 short b = (short)a; // 2 bytes

	 
		 
		 // ������ ����ȯ
		 short c = 10; // 2 bytes
		 int d = c; // 4 bytes
		 
		 
		 // byte x = 128; // ������ 1bytes -128~127����
		               // ���� ��� 
		 
		  int a1 = 128;
		  byte x1 = (byte)a1;
		  
		 System.out.println(x1); //--�����Ⱚ�� ��(-128) error
		 
		 
	 }
}
