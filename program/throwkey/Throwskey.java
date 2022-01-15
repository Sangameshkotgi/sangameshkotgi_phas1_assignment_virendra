package program.throwkey;

import java.io.IOException;



public class Throwskey {
	void m() throws IOException{  
	    throw new IOException("device error");  
	  }  
	  
	  void n() throws IOException{  
	    m();   
	  }  
	  
	  void p(){  
	   try{  
	    n();  
	   }
	   catch(Exception e)
	   {
		   System.out.println("exception handled");
		   System.out.println(e.getMessage());
		   System.out.println(e.getStackTrace());
		   System.out.println(e.getClass());
	   }  
	  }  
	  
	  public static void main(String args[]){  
		   Throwskey obj=new Throwskey();  
		   obj.p();  
		   System.out.println("normal flow...");  
}
}