package com.array;


import java.util.Arrays;
import java.util.Collections;

//Find the largest three distinct elements in an array
//Input: arr[] = {10, 4, 3, 50, 23, 90}
//        Output: 90, 50, 23
public class Find3MaxElement {
    public static void main(String[] args) {
      //int arr[] = {10, 4, 3, 50, 23, 90};
        int[] arr = { 12, 45, 1, -1, 45, 54, 23, 5, 0, -10 };
       int first, second, thrid;
       first = second = thrid = Integer.MIN_VALUE;
      if(arr.length < 3)
          System.out.println("Please length should be greater then 3.");

      for(int i = 0; i < arr.length;i++){
          if(arr[i] > first){
                thrid = second;
                second = first;
                first = arr[i];

           }else if(arr[i] > second) {
              thrid = second;
              second = arr[i];

          }else if(arr[i] > thrid)
               thrid = arr[i];

      }

        System.out.println(first);
        System.out.println(second);
        System.out.println(thrid);


        //Using java 8
        System.out.println("Using java 8.");
        Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).distinct().limit(3).forEach(System.out::println);

    }
}
