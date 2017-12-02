package com.nt.command;

public class StudentCmd {
	private Integer sno;
	private String sname;
	private String sadd="hyd";
	
	public StudentCmd() {
		System.out.println("StudentCmd:0-param contructor");
	}
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

}
