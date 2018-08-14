package Testtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Time_cal {

	public static void main1() {
		// TODO Auto-generated method stub
		/*
		long millisCurrentTime = System.currentTimeMillis() ;
		System.out.println(millisCurrentTime);
		long job_start_time=1500270616259L;
		long job_duratin=millisCurrentTime-job_start_time;
		System.out.println(job_duratin);
		
		long a=1500977554750L;
		long b=1500270990476L;
		System.out.println(a-b);
		*/
		long time =1501523021788L;
		SimpleDateFormat sdf = new SimpleDateFormat();
	    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	    System.out.println(sdf.format(new Date(time)));
	    
	    long test=1470014599L;
	    //long days = TimeUnit.MILLISECONDS.toDays(test);
	    System.out.println(String.format("%d min, %d sec", 
	    	    TimeUnit.MILLISECONDS.toMinutes(test),
	    	    TimeUnit.MILLISECONDS.toSeconds(test) - 
	    	    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(test))
	    	));
	    //System.out.println(test);
	    
	    System.out.println(String.format("%02d:%02d:%02d", 
	    		TimeUnit.MILLISECONDS.toHours(test),
	    		TimeUnit.MILLISECONDS.toMinutes(test) -  
	    		TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(test)), // The change is in this line
	    		TimeUnit.MILLISECONDS.toSeconds(test) - 
	    		TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(test))));
	    
	    System.out.println(String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(test),
	    	    TimeUnit.MILLISECONDS.toMinutes(test) % TimeUnit.HOURS.toMinutes(1),
	    	    TimeUnit.MILLISECONDS.toSeconds(test) % TimeUnit.MINUTES.toSeconds(1)));
	    
	    //System.out.println(hms);
	    
	    String Str = new String("Welcome to Tutorialspoint.com");

	    System.out.print("Return Value :" );
	    Str=Str.toUpperCase();
	    System.out.println(Str);
	}

}
