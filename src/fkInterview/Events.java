package fkInterview;

import java.util.Date;
import java.util.HashMap;

public class Events {
	private String start;
	private String end;
	private String location;
	private String owner;
	private HashMap<String,String> userList;
	private String title;
	
	public Events(String start,String end,String location,String owner,HashMap<String,String> userList,String title){
		this.start=start;
		this.end=end;
		this.location=location;
		this.owner=owner;
		this.userList=userList;
		this.title=title;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public HashMap<String, String> getUserList() {
		return userList;
	}
	public void setUserList(HashMap<String, String> userList) {
		this.userList = userList;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
