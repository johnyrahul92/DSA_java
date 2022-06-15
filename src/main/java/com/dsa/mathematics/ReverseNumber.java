package com.dsa.mathematics;

public class ReverseNumber {
    public static void main(String[] args) {
        
        int num=404;
        int res=0;
        while(num>0){

            res=(res*10)+(num%10);
            num/=10;

        }

        System.out.println(res);
    }
}
