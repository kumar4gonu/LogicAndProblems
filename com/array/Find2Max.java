package com.array;

//Find Second largest element in an array
//Input: arr[] = {12, 35, 1, 10, 34, 1}
 //Output: The second largest element is 34.


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Find2Max {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        int first , second;
        first = second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println(second);

        //Using java 8
        System.out.println("Using java 8");
        Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

    }
}
