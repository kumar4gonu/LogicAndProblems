package com.array;


//Move all zeroes to end of array

//Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

//Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
//Output : arr[] = {1, 2, 3, 6, 0, 0, 0};


import java.util.Arrays;

public class MoveAllZeroInEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length;j++){
                if(arr[j] == 0 && j !=0){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        Arrays.stream(arr).boxed().forEach(System.out::println);

        System.out.println("------------------------------");
        for(int i=arr.length -1; i >= 0; i--){
            for(int j=arr.length-1; j >= 0;j--){
                if(arr[j] == 0 && j !=arr.length-1){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Arrays.stream(arr).boxed().forEach(System.out::println);




    }
}
