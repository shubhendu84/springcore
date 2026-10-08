package com.kk.springcollectiondependencyinjection.beans;

import java.util.List;
import java.util.Set;

public class Course {

	private List<String> subject;
	private Set<String> faculties;

	public Course(Set<String> faculties) {
		this.faculties = faculties;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Course [subject=" + subject + ", faculties=" + faculties + "]";
	}

}