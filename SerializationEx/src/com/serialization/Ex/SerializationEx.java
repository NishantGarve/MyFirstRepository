package com.serialization.Ex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) throws IOException {
		Student s = new Student();
		s.age = 31;
		s.name = "Nishant";
		FileOutputStream fos = new FileOutputStream("Intro.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
	}

}
