package inner_class;

public class AnonymousInnerClass {
	public void facilities()
	{
		System.out.println("call&msg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass basicset = new AnonymousInnerClass();
		basicset.facilities();
		AnonymousInnerClass mobile = new AnonymousInnerClass()
				{
			public void facilities() {
				System.out.println("whatsapp,Fb,video call");
			}
				};
				mobile.facilities();
		

	}

}
