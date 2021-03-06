package edu.gatech.seclass.gradescalculator;

public class Student {
	private String name;
	private String gtid;
	private String team;
	private Course course;
	private int attendance;
	
	public Student(){
		this.name="";
		this.gtid="";
		this.team="";
		this.attendance=0;
		this.course=null;
	}
	
	public Student(String name, String gtid, Course course){
		this.name=name;
		this.gtid=gtid;
		this.team="";
		this.attendance=0;
		this.course=course;
	}
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setGtid(String gtid){
		this.gtid=gtid;
	}
	
	public void setTeam(String team){
		this.team=team;
	}
	
	public void setAttendance(int attendance){
		this.attendance=attendance;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getGtid(){
		return this.gtid;
	}
	
	public String getTeam(){
		return this.team;
	}
	
	public int getAttendance(){
		return this.attendance;
	}

}
