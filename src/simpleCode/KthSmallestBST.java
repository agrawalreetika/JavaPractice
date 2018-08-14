package simpleCode;

import java.text.MessageFormat;

public class KthSmallestBST {

	public static void main(String [] args){
		
		final String EMPTY = "";
		//--where "ts>'1900-12-31 16:00:00' and ts<='2018-05-15 03:43:26'"
		String rows="";
		//String rows1 = rows != null ? " --where \"" + rows + "\" " : " ";
		
		//rows = rows != null ? " --where " + '"' + rows + '"': " ";
		
		rows = rows = !EMPTY.equals(rows) ? " where " + rows : " ";
		//System.out.println(rows1);
		System.out.println(rows);
		
		String c = "\\n";
		System.out.println(c);
		
		int x = 'd' - 'a';
		System.out.println(x);
		
		final String CREATE_QUERY = "CREATE TABLE {0}.{1} LIKE {2};INSERT INTO {0}.{1} {3}";
		
		String src = "ragraw1.testtime4 where ts>'1900-12-31 16:00:00' and ts<='2018-05-21 03:36:44'";

		String databaseName = "ragraw1";
		String tableName = "tmp_aorta_regression_app2_DEV"; 
		String existinDb = src.toLowerCase().split(" ")[0];
		System.out.println(existinDb);
		String hiveQuery = "select * from ragraw1.testtime4 where ts>'1900-12-31 16:00:00' and ts<='2018-05-21 03:36:44'";
		String createQuery = MessageFormat.format(CREATE_QUERY, databaseName, tableName,existinDb ,hiveQuery);
		
		System.out.println(createQuery);
	}
}
