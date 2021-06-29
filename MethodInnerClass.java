package inner_class;

public class MethodInnerClass {
	public void createInnerClass()
	{
		class Inner
		{
	      public void method() {
	    	  System.out.println("Inner class");
	      }
		}
		Inner i = new Inner();
		i.method();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInnerClass m = new MethodInnerClass();
		m.createInnerClass();
		
	}

}
