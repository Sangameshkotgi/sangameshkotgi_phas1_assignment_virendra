package program.calssandobjects;

public class Pen {
	    String name;  
	    int price; 
	    String color; 
	    public Pen (String name, int price, String color) 
	    { 
	        this.name = name;  
	        this.price = price; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	         return name; 
	    } 
	   
	    public int getPrice() 
	    { 
	    	return price; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ ".\nMy price and color are " + this.getPrice()+", and"+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        Pen park = new Pen("parker",150,"black"); 
	        System.out.println(park.toString()); 
	    } 
	}


