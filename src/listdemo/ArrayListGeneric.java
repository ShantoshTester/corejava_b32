package listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListGeneric {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		// add() : to add the objects into a collection
		al.add("charlie");
		al.add("daniel");
		al.add("rita");
		al.add("roa");
		al.add("charlie");
		al.add("shantosh");
		al.add("nancy");
		
		
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
		
		System.out.println("*************************************************");
		
		List<Integer> listElements = new LinkedList<Integer>();
		listElements.add(10);
		listElements.add(10);
		listElements.add(10);
		listElements.add(10);
		listElements.add(10);
		
		System.out.println(listElements);

	}

}

















