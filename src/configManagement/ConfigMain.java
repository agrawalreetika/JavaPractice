package configManagement;

import java.util.HashMap;

public class ConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fileCount=3;
		Configs[] files=new Configs[fileCount];
		
		//File 1
		HashMap<String,String> hm1=new HashMap<String,String>(); 
		hm1.put("1", "a");
		hm1.put("2", "b");
		hm1.put("3", "k1");
		Configs file1=new Configs(null,1,hm1);
		
		//File 2
		HashMap<String,String> hm2=new HashMap<String,String>(); 
		hm2.put("4", "d");
		hm2.put("5", "e");
		hm2.put("6", "f");
		hm2.put("3", "c");
		Configs file2=new Configs(null,2,hm2);
		
		//File 3
		HashMap<String,String> hm3=new HashMap<String,String>(); 
		hm3.put("7", "g");
		hm3.put("8", "h");
		hm3.put("9", "i");
		hm3.put("10", "j");
		hm3.put("3", "x");
		hm3.put("5", "k");
		Configs file3=new Configs(null,3,hm3);
		
		//file1<-file2<-file3
		file2.setPre(file1);
		file3.setPre(file2);
		
		files[0]=file1;
		files[1]=file2;
		files[2]=file3;
		
		/*
		for(String key : file3.getHmap().keySet()){	
			String k=key;
			String value=file3.getHmap().get(k);
			System.out.println("key:"+k+",value:"+value);
		}
		*/
		//Operations
		ConfigOperations op=new ConfigOperations();
		op.fetchById(file3,3);	
		op.fetchAll(file3);

	}

}
