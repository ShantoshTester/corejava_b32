package listdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List al = new ArrayList<>();
		// add() : to add the objects into a collection
		al.add("charlie");
		al.add(20);
		al.add(36.33);
		al.add(20);
		al.add("charlie");
		al.add(100);
		al.add(true);
		
		// size() : which gives the size of the objects from the collection
		System.out.println("current size of the al : "+al.size());
		
		// get(index) : which will retrieve the object based on its index
		System.out.println(al.get(6));
		
		System.out.println(al);
		
		// print all the objects
		for(Object listValues:al)
		{
			System.out.println(listValues);
		}

	}

}
