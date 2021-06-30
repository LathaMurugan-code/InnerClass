package inner_class;
//Anonymous inner class that extends class
public class ExtendsInner {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread()
				{
			     public void run()
			     {
			    	 for (int i=0;i<5;i++)
			    	 {
			    		 System.out.println(i);
			    	 }
			     }
				};
	  t.start();
		}
}
