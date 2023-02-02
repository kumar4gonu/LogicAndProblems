package com.twodarray;

public class TwoDArray {
    public static void main(String[] args) {
        travel2DArray();
    }

    public static void travel2DArray(){
        int arr[][] = new int[4][4];
        int val = 1;
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = val;
                val++;
            }
        }

//        for(int i=0;i<arr.length;i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+ ",");
//            }
//            System.out.println();
//        }
        int j =0;
        for(int i=0; i < arr.length;i++){
            System.out.print(arr[i][i+j] + ",");
            //j = j + 2;
        }
        System.out.println();
        j = arr[0].length -1;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i][j-i]+ ",");
        }
    }
}
