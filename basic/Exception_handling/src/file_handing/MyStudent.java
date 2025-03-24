package file_handing;

import java.io.Serializable;

public class MyStudent implements Serializable{

	private int rollNo;
	private String name;
	private double per;
	
	
	public MyStudent(int rollNo, String name, double per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}


	public MyStudent() {
		super();
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPer() {
		return per;
	}


	public void setPer(double per) {
		this.per = per;
	}


	@Override
	public String toString() {
		return "MyStudent [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}


	
}
