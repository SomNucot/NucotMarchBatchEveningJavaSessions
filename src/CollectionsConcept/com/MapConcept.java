package CollectionsConcept.com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> omap=new HashMap<Integer,String>();
		
		omap.put(1, "Sojaneya");
		omap.put(2, "Lokesh");
		omap.put(3, "Krathi");
		omap.put(4, "Sunnel");
		omap.put(5, "Rajendra");
		omap.put(6, "Shrishil");
		
		System.out.println(omap.size());
		
		System.out.println(omap);
		Set<Entry<Integer, String>>  oset=omap.entrySet();
		System.out.println(oset);
		
		
		
		for(HashMap.Entry<Integer,String> entry : omap.entrySet())
		{  
            System.out.println(entry.getKey() + " : --->>" +entry.getValue());  
        }  
		
		
	}

}
