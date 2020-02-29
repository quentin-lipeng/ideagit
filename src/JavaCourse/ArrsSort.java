package JavaCourse;
import java.util.Arrays;
public class ArrsSort {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random()*5);
            //System.out.println(Arrays.toString(arr));
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
            if((i+1)%10==0) {
                System.out.print("\n");
            }
        }
    }
}
