package com.eh.beans;

import org.springframework.context.ApplicationListener;

public class ReloadEventListener implements ApplicationListener<ReloadEvent> {
	@Override
	public void onApplicationEvent(ReloadEvent event) {
		System.out.println("call handler to reload : " + event.getTableName()
				+ " ....");
	}
}
