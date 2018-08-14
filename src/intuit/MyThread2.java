package intuit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

public class MyThread2 extends Thread{
	
	private String to;
	public MyThread2(String to){
		this.to=to;
	}
	
	public String base64(String s){
		byte[] encodedBytes = Base64.getEncoder().encode(s.getBytes());
		String result = new String(encodedBytes);
		return result;
	}
	
	public void run(){
		System.out.println("stage2:"+base64(to));
		synchronized(this){
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
