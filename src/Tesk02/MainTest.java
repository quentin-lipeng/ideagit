package Tesk02;
import java.time.LocalDate;
import Tesk02.Student.Gender;

public class MainTest {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student(30602190218L,"黎冠鹏",Gender.Male,LocalDate.of(2000,03,15)));
        students.add(new Student(2222222L,"LiHua",Gender.Female,LocalDate.of(2000,01,01)));
        students.add(new Student(3333333L,"LiHua",Gender.Male,LocalDate.of(2000,01,01)));
        students.add(new Student(4444444L,"LiHua",Gender.Female,LocalDate.of(2000,01,01)));
        students.add(new Student(5412341L,"LiHua",null,LocalDate.of(2000,01,01)));
        Print(students);
        ArrayList<Teacher> teacher = new ArrayList<>();
        teacher.add(new Teacher("李老师"));
        Print(teacher);
        
        //s的类型无需定义 因为filter已经定义泛型为Student 因为filter的类型是Predicate<Student> 所以可使用lambda
//        StudentArrayList list = student.filter(s -> s!=null && s.getGender() != Gender.Male && s.getGender() != null);
//        Print(list);
    }
	
    public static void Print(ArrayList<?> element){
    	System.out.println("size= "+ element.size());
    	for (Object a : element) {
        	System.out.println(a);
        }
    }
}
