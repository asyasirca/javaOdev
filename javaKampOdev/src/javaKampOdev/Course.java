package javaKampOdev;

public class Course {
	
	public Course() {
		System.out.println("ben çalýþtým");
		
	}
	
	public Course(int id,String name,String educator,String detail,double price) {
		this();
		this.id = id;
		this.name = name;
		this.educator = educator;
		this.detail = detail;
		this.price = price;
	}
	int id;
	String name;
	String educator;
	String detail;
	double price;
	

}
