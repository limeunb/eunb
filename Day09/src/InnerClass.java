// c


public class InnerClass {

	 class InnerInnerClass {
		 
	 }
	 
	 static class StaticInnerClass {
		 
	 }
	 
	 public static void main(String[] args) {
		 InnerClass cls = new InnerClass();
		 InnerClass.InnerInnerClass inCls = cls.new InnerInnerClass();
		 InnerClass.StaticInnerClass sCls = new InnerClass.StaticInnerClass();
	 }
}
