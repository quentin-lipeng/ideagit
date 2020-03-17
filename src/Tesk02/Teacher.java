package Tesk02;

public class Teacher {
	private String name;
	
	public Teacher(String name) {
		this.setName(name);;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher = [name=" + name + "]";
	}
	

}
