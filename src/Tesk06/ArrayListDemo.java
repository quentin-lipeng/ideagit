package Tesk06;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//@param m 逢m就删除第m个同学
		String[] names = {"黎冠鹏", "李明", "王明", "李华", "王刚", "刘影"};
		int m = 4;
		ArrayList<Student> students = new ArrayList<>(names.length);
		for (String name : names) students.add(new Student(1001L+students.size(),name,null,null));
		
		int index = 0;
		while( students.size() > 1 ) {
			//因索引从0开始所以需要删除的下标-1
			//又因被删除数的后面会进行补位
			index = index + m - 1;
			/**如果index大于集合大小 就会求出余数
			如果index等于集合大小 就会等于0 
			如果index小于集合大小 就会等于本身*/
			index = index % students.size();
			System.out.println(students.remove(index));
		}
		System.out.println("最后的同学：");
		students.forEach(System.out::println);
	}

}
