package inner_class;

public class Outside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalInnerClass n = new NormalInnerClass();
		NormalInnerClass.Inner i = n.new Inner();
		i.call();
	}

}
