package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		// put() is the method which is used to add the object to the collection
		map.put(500, "Internal Server Error");
		map.put(200, "Ok");
		map.put(500, "Internal Server Error");
		map.put(400, "Bad Request");
		map.put(301, "Moved Permanently");
		map.put(505, "Bad Gateway");
		map.put(304, "Not Modified");
		map.put(201, "Created");
		map.put(100, "Continue");
		map.put(500, "Internal Server Error");
		
		//size() is a method which is used to get the size of the objects from the collection
		System.out.println("current size of the map collection : "+map.size());
		
		//get(key)
		System.out.println(map.get(500));
		
		System.out.println("*************************************************");
		
		System.out.println(map);

	}

}
