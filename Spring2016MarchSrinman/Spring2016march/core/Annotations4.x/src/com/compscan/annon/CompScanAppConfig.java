package com.compscan.annon;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class CompScanAppConfig {
	@Autowired
	private Calendar calendar;

	@Bean(name = "calendar")
	public Calendar newCalendar() {
		return Calendar.getInstance();
	}

	@Bean(name = "alarm")
	@DependsOn("calendar")
	public Alarm newAlarm() {
		Alarm alarm = null;

		alarm = new Alarm(calendar);
		return alarm;
	}
}
