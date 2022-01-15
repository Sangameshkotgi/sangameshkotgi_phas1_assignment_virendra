package program.trycatch;

public class ExceptionHandle {

	public static void main(String[] args) {
		int num1,num2,num3;
	     num1=10;
		 num2=0;
		 
		try {
			num3=num1/num2;
			System.out.println("print num3"+num3);
		}
		catch(ArithmeticException ae) {
			System.out.println("number cannot be divided by zero");
		}
		catch(Exception ae1) {
			System.out.println("parent exception");
		}
		finally {
			System.out.println("always be executed");
		}
		num3=num1+num2;
		System.out.println("the addition of num1 and num2 is"+num3);
		
		
}
}
