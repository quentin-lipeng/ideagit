package Tesk02;

import java.time.LocalDate;

public class Student {
	private Long id;
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    enum Gender {
        Female , Male ;
    }

    public Student(Long id, String name, Gender gender, LocalDate birthDate) {
        setId(id);
        setName(name);
        setGender(gender);
        setBirthDate(birthDate);
    }

    public Long getId(){
        return this.id;
    }
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge(){
        return this.birthDate.until(LocalDate.now()).getYears();
    }
    public String toString(){
        return  "Students = [id=" +this.id + "," +
                "name=" + this.name + "," +
                "gender=" + this.gender + ","+
                "birthDate=" + this.birthDate + "]";
    }

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//判断是否为同一类
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (gender != other.gender)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
}
