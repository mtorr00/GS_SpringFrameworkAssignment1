package org.genspark.martintorrey;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private List<Phone> ph;
	private Address add;
	
	//getters and setters-------------------------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Phone> getPh() {
		return ph;
	}
	public void setPh(List<Phone> ph) {
		this.ph = ph;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	//---------------------------------------------------------------
	
	
	//toString override----------------------------------------------
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ph=" + ph + ", add=" + add + "]";
	}
	//---------------------------------------------------------------
	
	
	
	//constructors---------------------------------------------------
	public Student(int id, String name, List<Phone> ph, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.ph = ph;
		this.add = add;
	}
	public Student() {
		super();
	}
	//---------------------------------------------------------------
}
