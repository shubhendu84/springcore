package com.kk.springcollectiondependencyinjection.beans;

import java.util.Map;
import java.util.Properties;

public class College {

	private Map<String, Course> hodtoCourse;

	private Properties courseTopper;

	public void setHodtoCourse(Map<String, Course> hodtoCourse) {
		this.hodtoCourse = hodtoCourse;
	}

	public void setCourseTopper(Properties courseTopper) {
		this.courseTopper = courseTopper;
	}

	@Override
	public String toString() {
		return "College [hodtoCourse=" + hodtoCourse + ", courseTopper=" + courseTopper + "]";
	}

}
