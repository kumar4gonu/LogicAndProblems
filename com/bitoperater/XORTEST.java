package com.bitoperater;

public class XORTEST {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1,2,4,5,6};
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
