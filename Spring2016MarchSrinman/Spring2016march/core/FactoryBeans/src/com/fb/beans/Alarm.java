package com.fb.beans;

import java.util.Calendar;

public class Alarm {
	private Calendar time;

	public void sayTime() {
		System.out.println(time.getTime());
	}

	public void setTime(Calendar time) {
		this.time = time;
	}

}
