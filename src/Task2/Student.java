package Task2;

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
}
