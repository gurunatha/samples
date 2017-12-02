package com.nt.vo;

public class StudentVO {
	private String sno;
	private String sname;
	private String total;
	private String avg;
	private String result;

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "StudentVO [sno=" + sno + ", sname=" + sname +",total="+total+ ", avg=" + avg + ", result=" + result + "]";
	}

}
