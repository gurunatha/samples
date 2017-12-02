package com.nt.beans;

public class CheckVotingElgibility {
	private String name;
	private  int age;
	private String address;
	
	public void setName(String name) {
		System.out.println("setName(-)");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("setAge(-)");
		this.age = age;
	}
	public void setAddress(String address) {
		System.out.println("setAddress(-)");
		this.address = address;
	}
	
	public void myInit()throws Exception{
		System.out.println("myInit()");
		if(name==null || age<=0){
			throw new Exception(" make sure that name,age values are set with proper values");
		}
	}
	//b.method
	public String  checkVotingEligibility(){
		if(age>=18)
			return name+" u  r elegible to vote";
		else
			return name+" u r not elgible to vote";
	}
	
	public void myDestroy(){
		System.out.println("myDestroy()");
		name=null;
		age=0;
		address=null;
	}
	
	@Override
	public String toString() {
		return "CheckVotingElgibility [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}//method
