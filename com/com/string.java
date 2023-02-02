package com.com;

public class string {
    public static void main(String[] args) {
        permute("ABC", 0,2);
    }

    public static void permute(String s, int l, int r){
                 if(l == r){
                     System.out.println(s);
                     return;
                 }

                 for(int i=0;i<s.length();i++){
                     s = swipe(s, l ,i);
                     permute(s,l+1,r);
                     s = swipe(s,l,i);
                 }
    }

    public static String swipe(String str, int l, int r){
       StringBuilder sb = new StringBuilder(str);
       sb.setCharAt(l, str.charAt(r));
       sb.setCharAt(r,str.charAt(l));

       return sb.toString();
    }
}
