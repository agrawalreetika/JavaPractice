package intuit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.stream.Stream;

class MyThread extends Thread

{ 
	private String to;
	public MyThread(String to){
		this.to=to;
		//System.out.println("In MyThread::"+to);
	}
	
	public String reverseString(String s){
		String result = "";
		for(int i=s.length()-1;i>0;i--){
			result=result+s.charAt(i);
		}
		return result;
	}
	
	public void run(){
		System.out.println("stage1:"+reverseString(to));
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
