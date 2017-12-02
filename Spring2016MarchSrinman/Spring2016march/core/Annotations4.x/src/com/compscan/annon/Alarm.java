package com.compscan.annon;

import java.util.Calendar;

public class Alarm {
	private Calendar calendar;

	public Alarm(Calendar calendar) {
		this.calendar = calendar;
	}

	@Override
	public String toString() {
		return "Alarm [calendar=" + calendar + "]";
	}

}
