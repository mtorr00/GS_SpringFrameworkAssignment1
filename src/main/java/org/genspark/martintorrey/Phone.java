package org.genspark.martintorrey;

public class Phone {
	private String mob;
	
	//getters and setters-------------------------------------
	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}
	//----------------------------------------------------------
	
	//constructors----------------------------------------------
	public Phone(String mob) {
		super();
		this.mob = mob;
	}

	public Phone() {
		super();
	}
	//-----------------------------------------------------------
	
	
	//toString override------------------------------------------
	@Override
	public String toString() {
		return "Phone#: " + mob;
	}
	
	
	
}
