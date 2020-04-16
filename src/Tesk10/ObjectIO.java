package Tesk10;

import java.io.*;
import java.util.ArrayList;

public class ObjectIO {
	private static File file = null;
	private static ArrayList<String> arrL;

	public static void main(String[] args) {
		file = new File("src\\Obj.dat");
//		arrL = new ArrayList<>();
//		arrL.add("a");
//		ObjectOut();
		ObjectIn();
		
	}

	public static void ObjectOut() {
		ObjectOutputStream oo = null;
		try {
			 oo = new ObjectOutputStream(new FileOutputStream(file));
			 oo.writeObject(arrL);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oo != null) {
				try {
					oo.flush();
					oo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void ObjectIn() {
		ObjectInputStream oi = null;
		try {
			oi = new ObjectInputStream(new FileInputStream(file));
			@SuppressWarnings("unchecked")
			ArrayList<String> list = (ArrayList<String>)oi.readObject();
			list.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (oi != null) {
				try {
					oi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
