package Task2;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        StudentArrayList student = new StudentArrayList();
        student.add(new Student(10000000001L,"LiHua",Student.Gender.Male,LocalDate.of(2000,01,01)));
        student.add(new Student(11111111111L,"LiHua",Student.Gender.Male,LocalDate.of(2000,01,01)));
        student.add(new Student(22222222222L,"LiHua",Student.Gender.Male,LocalDate.of(2000,01,01)));
        student.add(new Student(33333333333L,"LiHua",Student.Gender.Male,LocalDate.of(2000,01,01)));
        student.add(new Student(44444444444L,"LiHua",Student.Gender.Male,LocalDate.of(2000,01,01)));
        student.add(new Student(55555555555L,"LiHua",Student.Gender.Male,LocalDate.of(2000,01,01)));

        student.remove(5);
        student.set(1,(new Student(30602190204L,"LiHua",Student.Gender.Male,LocalDate.of(2000,01,01))));
        Print(student);
    }
    public static void Print(StudentArrayList student){
        for (int i=0; i<student.size(); i++){
                System.out.println(student.get(i));
        }
    }
}
