package Java_program.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};  // In case of Reverse int does not work
        Arrays.sort(arr); // Using inbuilt sort
        PrintArray(arr);

        Arrays.sort(arr, Collections.reverseOrder()); // Reverse arr using inbuilt function
        PrintArray(arr);
    }
    public static void PrintArray(Integer arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
