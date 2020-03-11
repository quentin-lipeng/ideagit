package Tesk02;
import java.time.LocalDate;
import Tesk02.Student.Gender;

public class MainTest {
	public static void main(String[] args) {
        StudentArrayList student = new StudentArrayList();
        
        student.add(new Student(1000001L,"LiHua",Gender.Male,LocalDate.of(2000,01,01)));
        student.add(new Student(1111111L,"LiHua",Gender.Male,LocalDate.of(2000,01,01)));
        student.add(null);
        student.add(new Student(2222222L,"LiHua",Gender.Female,LocalDate.of(2000,01,01)));
        student.add(new Student(3333333L,"LiHua",Gender.Male,LocalDate.of(2000,01,01)));
        student.add(new Student(4444444L,"LiHua",Gender.Female,LocalDate.of(2000,01,01)));
        student.add(new Student(5412341L,"LiHua",null,LocalDate.of(2000,01,01)));
        Print(student);
        
        //s的类型无需定义 因为filter已经定义泛型为Student 因为filter的类型是Predicate<Student> 所以可使用lambda
//        StudentArrayList list = student.filter(s -> s!=null && s.getGender() != Gender.Male && s.getGender() != null);
//        Print(list);
    }
	
    public static void Print(StudentArrayList student){
    	System.out.println("size= "+ student.size());
    	for (Student a : student) {
        	System.out.println(a);
        }
    }
}
