package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class College {
	private Map<String, Course> hodToCourseMap;
	private Properties achievements;

	public College(Map<String, Course> hodToCourseMap) {
		this.hodToCourseMap = hodToCourseMap;
	}

	public void setAchievements(Properties achievements) {
		this.achievements = achievements;
	}

	@Override
	public String toString() {
		return "College [hodToCourseMap=" + hodToCourseMap + ", achievements="
				+ achievements + "]";
	}

}
