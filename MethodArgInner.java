package inner_class;
//Anonymous inner cls inside method/constructor args
public class MethodArgInner {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable()
		{
			public void run() {
				System.out.println("From Runnable interface declared in arg");
				}
			});
		t.start();
		}
}
