package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream stream = new FileOutputStream("sample.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(stream);
		
		ToBeSerialized serialized = new ToBeSerialized();
		serialized.st = "RANDOm";
		oos.writeObject(serialized);
		
		FileInputStream stream2 = new FileInputStream("sample.ser");
		ObjectInputStream iis = new ObjectInputStream(stream2);
		ToBeSerialized serialized2 = (ToBeSerialized)iis.readObject();
		
		System.out.println(serialized2.s);
		System.out.println(serialized2.tr);
		System.out.println(serialized2.st);
		
	}
}

class ToBeSerialized implements Serializable {
	
	public static String st;
	
	public final transient String tr = "tr";
	
	public String s = "NORMAL";
	
	
}