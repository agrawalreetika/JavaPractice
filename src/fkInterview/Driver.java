package fkInterview;

import java.util.HashMap;
import java.util.Scanner;

public class Driver {
	static HashMap<Integer,Events> EventList=new HashMap<Integer,Events>();
	static int eventCount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventOperations op=new EventOperations();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Operation:");	
	
		while(true){
			System.out.println("1.Create Event \n 2.Update Event \n 3.Get EventList");
			int in=sc.nextInt();
			switch(in) {
				case 1 :
					    System.out.println("Event Count::"+eventCount);
						op.createEvent(eventCount, EventList);
						eventCount++;
						continue;
				case 2 :
						System.out.println("Enter owner Name");
						String owner=sc1.nextLine();
						op.updateEvent(owner, EventList);
						continue;
				case 3:
						System.out.println("Enter user Name");
						String user=sc1.nextLine();
						//String user="a";
						op.getUserCalendar(user, EventList);
						continue;
				default :
					System.out.println("No action selected for calender!!");
					System.exit(0);
			}	
		}
	}

}
