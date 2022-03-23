package com.serialization.Ex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("Intro.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Student student = (Student)ois.readObject();
	System.out.println(student);
}
}
