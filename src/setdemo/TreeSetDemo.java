package setdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> hs= new TreeSet<String>();
		// add() to add the objects into the set collection
		hs.add("apple");
		hs.add("orange");
		hs.add("kiwi");
		hs.add("bananna");
		hs.add("mango");
		hs.add("apple");
		hs.add("blueberry");
		hs.add("strawberry");
		hs.add("cherry");
		hs.add("grapes");
		hs.add("kiwi");
		hs.add("watermelon");
		
		// size() method to get the current size of the objects
		System.out.println("current size of the hs : "+hs.size());
		
		System.out.println(hs);

	}

}
