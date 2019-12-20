package JavaCourse;

import java.util.Arrays;

public class BubbSort {
    public static void main(String[] args){
        int[] a= {0,1,4,5,6};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] values) {
        int temp;
        for (int i=0; i<values.length; ++i) {
            for (int j=0; j<values.length-1; ++j) {
                if (values[j] > values[j+1]) {
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
            }
        }
    }

}
