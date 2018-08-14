package configManagement;

import java.util.HashMap;
import java.util.Map.Entry;

public class ConfigOperations {
	
	public void insertProperty(String k,String v,int id,Configs first){
		while(first.getPre()!=null){
			if(first.getId()==id){
				HashMap<String, String> map = new HashMap<String, String>();
				map.put(k,v);
				first.setHmap(map);
				break;
			}
			first=first.getPre();
		}
	}
	
	public void fetchAll(Configs first){
		HashMap<String,String> hmapnew=new HashMap<String,String>();
		String value=null;
		while(first!=null){
			for(String key : first.getHmap().keySet()){
				if(hmapnew.containsKey(key)){
					hmapnew.remove(key);
					value=first.getHmap().get(key)+":"+first.getId();
					hmapnew.put(key,value);
				}
				else{
					value=first.getHmap().get(key)+":"+first.getId();
					hmapnew.put(key,value);
				}
			}
			first=first.getPre();
		}
		System.out.println(hmapnew);
	}
	
	public void fetchById(Configs first,int id){
		Configs child=first;
		if(first.getId()==id){
			//System.out.println("in2");
			//System.out.println(first.getHmap());
			for(String key : first.getHmap().keySet()){	
				String k=key;
				//System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
				String  value=first.getHmap().get(k);
				//System.out.println("in1");
				while(first!=null){
					//System.out.println("in");
					if(first.getHmap().containsKey(k)){
						value=first.getHmap().get(k);
					}
					first=first.getPre();
				}
				System.out.println("key:"+k+",value:"+value);
				first=child;
			}
		}
	}
	
	
}
