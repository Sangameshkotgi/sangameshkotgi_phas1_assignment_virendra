package program.oopsproblem;
interface First 
{  
    default void show() 
    { 
        System.out.println(" First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println(" Second"); 
    } 
}  
public class Interface implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Interface ob = new Interface(); 
        ob.show(); 

}
}