package com.eh.beans;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent {
	protected String tableName;

	public ReloadEvent(Object source, String tableName) {
		super(source);
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
