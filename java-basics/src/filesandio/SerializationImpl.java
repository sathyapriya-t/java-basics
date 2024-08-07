package filesandio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
Serialization and Deserialization is introduced because - it is difficult to write and store complex object  into file or database.

Manually Writing to file will cause lot of manual error - converting to correct types, Adding commos etc
Using Serializtion we can convert the object into stream of bytes and store it and then deserialize the object back
this prevents lot of manual errors

Serialization is the conversion of the state of an object into a byte stream; 
deserialization does the opposite. Stated differently, serialization is the conversion of a Java object into a static stream (sequence) of bytes, 
which we can then save to a database or transfer over a network.

ObjectOutputStream/ObjectInputStream - is an important for serialization and help to serialize an object 
This takes OutputStream as a constructor paramerter.

writeObject() - write the object to file /Database
readObject() - reads object from a file or data base

*/
public class SerializationImpl {
	public static void main(String[] args) {
		Person person = new Person(1, "sathya", "Coding");

		// serialization
		try (FileOutputStream fileOutputStream = new FileOutputStream(new File("serializeFile.txt"));
				// imp to write the object to the file using serialization
				ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

			outputStream.writeObject(person);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization
		try (FileInputStream fileInputStream = new FileInputStream(new File("serializeFile.txt"));
				// imp to read the object from the file
				ObjectInputStream intputStream = new ObjectInputStream(fileInputStream)) {

			Person p = (Person) intputStream.readObject();
			System.out.println(p);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

// If we are sorting object it must implement the marekable interface Serializable
// The classes which inherite this Person class must also be implemented with Serializable or else it will throw error.
class Person implements Serializable {

	// All serializer class must have UID
	// if we didn't create it JVM will automatically create it
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	
	// transient - when serializing you don't the value to store/transfer on any file/database  
	private transient String hobby;

	public Person(int id, String name, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", hobby=" + hobby + "]";
	}

}
