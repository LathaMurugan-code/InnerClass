package inner_class;
//Anonymous inner cls implements interface
public class ImplementsInner {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable()
		{
			public void run() {
				System.out.println("From Runnable interface");
			}
		};
//starting  thread using runnable interface
		Thread t = new Thread(r);
		t.start();
	}
		}
