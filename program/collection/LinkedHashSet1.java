package program.collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
				
				hs.add("apple");
				hs.add("banana");
				hs.add("carrot");
				hs.add("dryfruit");
				hs.add("falooda");
				hs.add("grapes");
				hs.add("guava");
				hs.add("mango");
				hs.add("chickoo");
				hs.add("orange");
						
				System.out.println("Hashset is "+hs);
				System.out.println("Size of Hashset is "+ hs.size());
				
				System.out.println("Does hashset contains this 'apple' element  " + hs.contains("apple"));		
				System.out.println("is hashset empty  " + hs.isEmpty());
				System.out.println("add the element "+hs.add("kiwi"));
				System.out.println("add the element "+hs.add("Strawberry"));
				System.out.println("add the element "+hs.add("pineaple"));
				System.out.println("Size of Hashset is "+ hs.size());
				System.out.println("Hashset is "+hs);
				System.out.println("remove the element "+hs.remove("apple"));
				System.out.println("remove the element "+hs.remove("banana"));
				System.out.println("Size of Hashset is "+ hs.size());
				
				
				
			    hs.clear();
			    System.out.println("get class  " +hs.getClass());
				
			    System.out.println("is hashset empty  " +hs.isEmpty());
			    

			}
}
