package program.map;

import java.util.Hashtable;

public class HashTable1 {
	public static void main(String[] args){
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"FIRST");
        ht.put(2,"SECOND");
        ht.put(3,"THIRD");
		ht.put(4,"THIRD");
		ht.put(5,"FOURTH");
		
        System.out.println("Hashtable is "+ht);
        System.out.println("Value of key 2: "+ht.get(2));
        System.out.println("Size of the Hashtable is  "+ht.size());
    }
}
