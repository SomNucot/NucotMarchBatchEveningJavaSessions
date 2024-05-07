package CollectionsConcept.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindDuplicateCharcters {

	public static void main(String[] args) {
		String dupNames[]= {"aa","bb","cc","aa","dd","ee","cc","ff","gg"};
		
		/*	System.out.println("printing the duplicate values");
			int len=dupNames.length;
			System.out.println(len);
			
			
			for(int i=0;i<dupNames.length;i++){
				for(int j=i+1;j<dupNames.length;j++){
					if(dupNames[i].equals(dupNames[j])){
						System.out.println("the dupvalues are-->"+dupNames[i]);
					}		
				}
			}
			
			//*****************************************************************
			
			//Using HashSet
			System.out.println("***********Using HashSet Method");
			Set<String> oset=new HashSet<String>();
			for(String nd:dupNames){	
				if(oset.add(nd)==false){
					System.out.println(nd);
				}		
			}
			

			*/
			//HashMap
			
			
			System.out.println("***********Using HashMap Method");
			Map<String,Integer> omap=new HashMap<String,Integer>();
			
			for(String obj:dupNames)
			{
				Integer count=omap.get(obj);
				if(count==null)
				{
					omap.put(obj, 1);
					
				}
				else
				{
					omap.put(obj, ++count);
				}
				
				
				//print the duplicate values
				
				
				
				Set<Entry<String, Integer>> entrysetvalues=omap.entrySet();
				
				for(Entry<String, Integer> entry:entrysetvalues)
				{
					
					if(entry.getValue()>1)
					{
						System.out.println("duplicate values are-->"+entry.getKey());
					}
					
					
					
				}
				
				
				
				
			}
			
			

	}

}
