import java.util.Arrays;

public class LearnArraysClass {
     public static void main(String[] args) {


          // int[] numbers = {1,2,3,4,5,6,7,8,9,10};
          // int index = Arrays.binarySearch(numbers, 4);
          // System.out.println(index);


          Integer[] numbers = { 10,2 ,34,45,33,56,78,91,32};
          Arrays.sort(numbers);
          for (int i : numbers) {
               System.out.println(i+ " ");
          }
     }
}
