package intuit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread thread1 = new MyThread("thread1: ");
		//MyThread thread2 = new MyThread("thread2: ");
		//MyThread thread3 = new MyThread("thread3: ");

		//thread1.start();
		//thread2.start();
		//thread3.start();
		
		//Read data from file
		String input = "/Users/ragraw1/Desktop/data.txt";
		String output = "/Users/ragraw1/Desktop/output.txt";
				
		BufferedReader br = null;
				
		try {
			br = new BufferedReader(new FileReader(input));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				String name = null;
				try {
					while ((name = br.readLine()) != null){
						//task1
						//System.out.println("In main::"+name);
						new MyThread(name).start();
						new MyThread2(name).start();
						
					}
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}


}
