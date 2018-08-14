package json_operations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();
 
		JSONArray company = new JSONArray();
		int array_length=2;
		for(int i=0;i<array_length;i++){
			JSONObject temp = new JSONObject();
			temp.put("job_id","123"+i);
			temp.put("user_name","ragraw1"+i);
			temp.put("queue","default"+i);
			company.add(temp);
		}
		obj.put("ClusterName", company);
 
		// try-with-resources statement based on post comment below :)
		FileWriter file = new FileWriter("/Users/ragraw1/Desktop/file1.txt");
		try {
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			file.flush();
			file.close();
		}
	}
}

