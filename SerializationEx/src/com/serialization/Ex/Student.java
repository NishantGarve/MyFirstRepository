package com.serialization.Ex;

import java.io.Serializable;

public class Student implements Serializable {
	int age;//transient used for not serializable.
	String name;

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

}
//Changes done