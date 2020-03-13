package Tesk02;


import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public class StudentArrayList implements Iterable<Student>{
	private Student[] element;
    //数组当前实际大小
    private int size;

    public StudentArrayList(){element = new Student[2];}
    
    public void add(Student element) {
        if(size >= this.element.length){this.switchElement();}
        
        this.element[size] = element;
        this.size++;
    }

    public Student remove(int index) {
        if (index < size){
            Student temp = this.element[index];
            for (int i=index ; i<size-1; i++) 
            	this.element[i] = this.element[i+1];
            if(this.element.length >(size + size/2)) 
            	this.switchElement();
            size--;
            return temp;
        }else {throw new NullPointerException("remove()IsNull");}
    }
    
    //必须重写equals方法 因为直接调用equals会直接用 == 判断两个对象是否为同一个引用
    public boolean remove(Student student) {
    	for (int i=0; i<size; i++) {
    		if (this.element[i] == null) {
//        		必须在此处写判断是否null 在Student中equals写调用时会报错
        		if (student == null) { remove(i);return true;}
        		//这行反之会报错 如果student.equals() 如果student为null 则肯定报错
    		}else if(this.element[i].equals(student)) {
    			remove(i);
    			return true;
    		}

    	}
    	return false;
    }
	
	//传入一个需要更改大小的数组@element
    private void switchElement() {
    	Student[] newElement = new Student[size+size/2];
    	for (int i=0;i<size;i++){
            newElement[i] = this.element[i];
        }
    	this.element = newElement;
    }

    public Student get(int index) {
        if (index < size){
            return this.element[index];
        }else {
            throw new NullPointerException("get()IsNull");
        }
    }

    public int size() {return size;}
    
    public Student set(int index, Student element) {
        if (index <size){
            Student temp = this.element[index];
                this.element[index] = element;
                return temp;
        }else {
            throw new IndexOutOfBoundsException("index");
        }
    }
    
    @Override
	public String toString() {return "StudentArrayList [element=" + Arrays.toString(element) + "]";}
    
	public StudentArrayList filter(Predicate<Student> predicate) {
		//创建一个数组 之后判断条件 如果符合 把元素添加到新的
		StudentArrayList filterObj = new StudentArrayList(); 
		for (Student s : this.element) {
			if(predicate.test(s)) {
				filterObj.add(s);
			}
		}
		return filterObj;
	}
	
	@Override
	public Iterator<Student> iterator() {
		return  new Iterator<Student>() {
			int count = 0;
			@Override
			public boolean hasNext() {
				return count <size;
			}
			@Override
			public Student next() {
				return StudentArrayList.this.element[count++];
			}
		};
	}
	
}
