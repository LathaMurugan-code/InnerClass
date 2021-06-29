package inner_class;

public class NormalInnerClass {
	static int k = 5;
	int j= 10;
	String value ="outer j and k";
	class Inner
	{   int k =10;
		int j = 20;
		String value = "inner k&j";
		public void call() {
			System.out.println("from Inner");
			//accessing static and non static fields from 
			//outer class
			System.out.println(this.k);
			System.out.println(this.j);
			System.out.println(this.value);
			//fields from outer class
			System.out.println(NormalInnerClass.this.k);
			System.out.println(NormalInnerClass.this.j);
			System.out.println(NormalInnerClass.this.value);

		}
	}
	public void fromMethod()
	{
		System.out.println("Accessing inner class from non-static method");
		Inner obj = new Inner();
		obj.call();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalInnerClass n = new NormalInnerClass();
		n.fromMethod();
		NormalInnerClass.Inner i = n.new Inner();
		System.out.println("Accessing inner class from static(main) method");
		i.call();

	}

}
