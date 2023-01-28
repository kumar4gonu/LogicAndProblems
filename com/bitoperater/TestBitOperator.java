package com.bitoperater;

public class TestBitOperator {
    public static void main(String[] args) {
      // int arr[] = {1,2,3,4,5,6,7,8,9};

//       Integer num1 = 127;
//       Integer num2 = 127;
//
//       if(num2 == num1)
//           System.out.println("Number matched.");

      ///  Integer num3 = 129;
        ///Integer num4 = 129;

//        if(num3 == num4) {
//            System.out.println("Number matched.");
//        }
//        if(num3.equals(num4)) {
//            System.out.println("Equals Number matched.");
//        }
//
//        System.out.println(num3 + num3);
//
//
//        System.out.println(num1 + "  " + num3);

        //  checkOddAndEven(100);
        BitOperator(10);
    }

      public  static void BitOperator(int n){
          System.out.println("Number : " + n);
          System.out.println(  n>>1);
          System.out.println(  n<<1);
      }


    public static void checkOddAndEven(int n){

        for(int i=1;i < n; i++){
            System.out.println("Bit code : " + Integer.toString(i, 2));
            System.out.println("Bit code : " + Integer.toBinaryString(i));
            if((i&1) != 0){
                System.out.println(" Odd Number : " + i);
            }else{
                System.out.println("Even Number : " + i);
            }
        }
    }
}
