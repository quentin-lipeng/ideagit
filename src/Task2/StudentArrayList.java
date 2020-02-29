package Task2;

public class StudentArrayList implements ListDemo{
    private Student[] element;
    //数组当前实际大小
    private int size;

    public StudentArrayList(){
        element = new Student[2];
    }

    @Override
    public void add(Student element) {
        if(size >= this.element.length){
            Student[] newElement = new Student[size+size/2];
            for (int i=0;i<this.element.length;i++){
                newElement[i] = this.element[i];
            }
            this.element = newElement;
        }
        this.element[size] = element;
        this.size++;
    }

    @Override
    public Student remove(int index) {
        if (index < size){
            Student temp = this.element[index];
            this.element[index] = null;
            for (int i=index;i<size-1;i++){
                this.element[i] = this.element[i+1];
            }
            size--;
            return temp;
        }else {
            throw new NullPointerException("remove()IsNull");
        }
    }

    @Override
    public Student get(int index) {
        if (index < size){
            return this.element[index];
        }else {
            throw new NullPointerException("get()IsNull");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Student set(int index, Student element) {
        if (index <size){
            Student temp = this.element[index];
                this.element[index] = element;
                return temp;
        }else {
            throw new IndexOutOfBoundsException("index");
        }
    }

}
