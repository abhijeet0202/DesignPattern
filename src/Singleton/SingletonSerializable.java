package Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonAgain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// public instance initialized when loading the class
	public static SingletonAgain instance = new SingletonAgain();

	private SingletonAgain() {
		// private constructor
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}
}

public class SingletonSerializable {

	public static void main(String[] args) {
		try {
			SingletonAgain instance1 = SingletonAgain.instance;
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
			SingletonAgain instance2 = (SingletonAgain) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
