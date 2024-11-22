package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOperations {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("Java", "PL");
		map.put("SQL", "DBMS");
		map.put("Git", "versionControl");
		
		System.out.println("HashMap "+map);
		
		
		for(Entry<String,String> entry:map.entrySet())
		{
			System.out.println(entry+" ");
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(String key: map.keySet())
		{
			System.out.println(key+" ");
		}
		
		for(String values: map.values())
		{
			System.out.println(values+" ");
		}
			
		
		List<String> list1 = new ArrayList<String>(map.keySet());
		List<String> list2 = new ArrayList<String>(map.values());
		
		
		System.out.println(list1);
		System.out.println(list2);

	}

}
