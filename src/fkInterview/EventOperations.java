package fkInterview;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EventOperations {
	
	//To get calendar details for a particular user
	public void getUserCalendar(String user,HashMap<Integer,Events> AllEvents){
		System.out.println("user::"+user);
		int totalEvents=AllEvents.size();
		System.out.println("All EventList for "+user+"::");
		for (Entry<Integer, Events> entry : AllEvents.entrySet()) {
			if(entry.getValue().getUserList().containsKey(user)){
				System.out.println("Event Title:"+entry.getValue().getTitle());
				System.out.println("Event StartTime:"+entry.getValue().getStart());
				System.out.println("Event EndTime:"+entry.getValue().getEnd());
				System.out.println("Event Owner:"+entry.getValue().getOwner());
				System.out.println("Event Status:"+entry.getValue().getUserList().get(user));
			}
			System.out.println("\n");
		}
	}
	
	public void deleteEvent(String owner,HashMap<Integer,Events> AllEvents){
		boolean flag=false;
		for (Entry<Integer, Events> entry : AllEvents.entrySet()) {
			if(entry.getValue().getOwner().equals(owner)){
				int Eventid=entry.getKey();
				flag=true;
				AllEvents.remove(Eventid);
			}
		}
	}
	public void createEvent(int id,HashMap<Integer,Events> AllEvents){
		Scanner sc = new Scanner(System.in);
		System.out.println(AllEvents.keySet());
		if(AllEvents.containsKey(id)){
			System.out.println("Event with "+id+" id exists already in Calendar,please choose different event id");
		}
		else{
			System.out.println("Enter Details:");
			
			//Start time
			System.out.println("Start Time in MM/DD/YYYY hh:mm:ss format:");
			String sTime=sc.nextLine();
			SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			DateFormat df = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			try
			{
			   df.parse(sTime);
			}
			catch(Exception e)
			{
			  System.out.println("Time not in correct format!!");
			}
			
			//End time
			System.out.println("End Time in MM/DD/YYYY hh:mm:ss format:");
			String eTime=sc.nextLine();
			SimpleDateFormat format1 = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			DateFormat df1 = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			try
			{
			   df1.parse(eTime);
			}
			catch(Exception e)
			{
			  System.out.println("Time not in correct format!!");
			}
			
			//Loction
			System.out.println("Enter event location");
			String location=sc.nextLine();
			
			//Owner
			System.out.println("Enter event owner");
			String owner=sc.nextLine();
			
			//Ttile
			System.out.println("Enter event title");
			String title=sc.nextLine();
			
			//Users
			//System.out.println("Enter event attendees count:");
			//int userCount=sc.nextInt();
			String user;
			HashMap<String,String> userList = new HashMap<String,String>();
			System.out.println("enter username in comma:");
			String users=sc.nextLine();
			String u[]=users.split(",");
			for(int i=0;i<u.length;i++){
				userList.put(u[i],"");
			}
		
			Events newEvent=new Events(sTime,eTime,location,owner,userList,title);
			AllEvents.put(id, newEvent);
			//AllEvents.put(id, newEvent);
		}
	}
	
	public void updateEvent(String owner,HashMap<Integer,Events> AllEvents){
		Events updateEvent=null;
		for (Entry<Integer, Events> entry : AllEvents.entrySet()) {
			if(entry.getValue().getOwner().equals(owner)){
				updateEvent=entry.getValue();
				break;
			}
		}
		if(updateEvent.equals(null)){
			System.out.println("No event exist with owner Name:"+owner);
		}
		else{
			while(true){
				System.out.println("Choose number what you want you want to update in Event");
				System.out.println("1.Update startTime \n2.Update endTime \n3.Update Location \n4.Update Owner \n5.Update Title \n6.Update UserList\n7.Done");
				Scanner sc = new Scanner(System.in);
				Scanner sc1 = new Scanner(System.in);
				int input=sc1.nextInt();
			      switch(input) {
			         case 1 :
			        	//Start time
			 			System.out.println("Start Time in MM/DD/YYYY hh:mm:ss format:");
			 			String sTime=sc.nextLine();
			 			SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			 			DateFormat df = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			 			try
			 			{
			 			   df.parse(sTime);
			 			   updateEvent.setStart(sTime);   
			 			}
			 			catch(Exception e)
			 			{
			 			  System.out.println("Time not in correct format!!");
			 			  continue;
			 			}
			         case 2 :
			        	//End time
			 			System.out.println("Start Time in MM/DD/YYYY hh:mm:ss format:");
			 			String eTime=sc.nextLine();
			 			SimpleDateFormat format1 = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			 			DateFormat df1 = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
			 			try
			 			{
			 			   df1.parse(eTime);
			 			   updateEvent.setStart(eTime);
			 			}
			 			catch(Exception e)
			 			{
			 			  System.out.println("Time not in correct format!!");
			 			  continue;
			 			}
			         case 3 :
			        	 System.out.println("Enter event location");
			 			 String location=sc.nextLine();
			 			 updateEvent.setLocation(location);
			 			continue;
			         case 4 :
			        	 System.out.println("Enter event owner");
			        	 System.out.println("N1");
			 			 String owner1=sc.nextLine();
			 			 updateEvent.setOwner(owner1);
			 			continue;
			         case 5 :
			        	 System.out.println("Enter event title");
			 			 String title=sc.nextLine();
			 			 updateEvent.setTitle(title);
			 			continue;
			         case 6 :
			        	 System.out.println("Enter event attendees count:");
			 			 int userCount=sc.nextInt();
			 			 HashMap<String,String> userList = null;
			 			 for(int i=0;i<userCount;i++){
			 				System.out.println("enter username:");
			 				String user=sc.nextLine();
			 				userList.put(user, "");
			 			}
			 			updateEvent.setUserList(userList);
			 			continue;
			         case 7:
			        	 System.exit(1);
			        	 break;
			 		default:
			 				
			 				System.exit(1);
			      }
			   }
				
		}
	}

	public void deleteEvent(Events delEvent,Events []events){
		
	}
}
