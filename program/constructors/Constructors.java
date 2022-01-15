package program.constructors;

public class Constructors {
	int x;
	double y;

	Constructors(int x)
	     {
	    	 this.x=x;
	    	 System.out.println("practice 1");
	     }
	    	
	     Constructors(double y)
	     {
	    	 this.y=y;
	    	 System.out.println("practice 2");
	     }
	     public void printvalues()
	     {
	    	 System.out.println("print x"+x);
	    	 System.out.println("print y"+y);
	     }
	     
		public static void main(String[] args) {
			Constructors p= new Constructors(5.2);
			p.printvalues();
}
}
