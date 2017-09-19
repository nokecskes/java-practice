package serializationpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPractice {
	
	public static void main(String[] args) {
		
		Hippo hippoToSerialize = new Hippo();
		
		System.out.println(hippoToSerialize.toString());
		
		try {
			FileOutputStream fileOut = new FileOutputStream("hippo.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(hippoToSerialize);
			objectOut.close();
			fileOut.close();
			System.out.println("Object is serialized.");
		} catch (IOException e) {
			e.printStackTrace();	
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		
		Hippo deserializedHippo = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("hippo.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			deserializedHippo = (Hippo) objectIn.readObject();
			objectIn.close();
			fileIn.close();		
			System.out.println("Object is deserialized.");
		} catch (IOException e) {
			e.printStackTrace();	
		} catch (ClassNotFoundException e) {
			System.out.println("Hippo class not found.");
			e.printStackTrace();	
		}
		
		System.out.println(deserializedHippo.toString());
		System.out.println(deserializedHippo.getClass().getName());
		
	}

}
