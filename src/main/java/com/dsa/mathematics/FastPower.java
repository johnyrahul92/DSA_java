package com.dsa.mathematics;

public class FastPower {
    
    public static void main(String[] args) {
        // a to pow of b -. 2 to pw of 4 is 16

        int a = 5, b = 4, n= 3;

        System.out.println(Math.pow(a, b));
        System.out.println(625%3);

        int res1= fatsPower(a,b);
        long res2= fatsPowerModulo(a,b,n);

        System.out.println(res1);
        System.out.println(res2);
    }

    private static long fatsPowerModulo(int a, int b, int n) {

        long res = 1;
        while(b>0){

            if((b&1) != 0){ // which means not odd (with the help of bitwise and)
                res = (res * (a%n))%n;
            }
            a=((a % n) * (a % n)) % n;
            b=b/2;

        }
        return res;
    }

    private static int fatsPower(int a, int b) {

        int res = 1;

        // with liner time complexity
        /*  while(b>0){
            res =  res * a;
            b-=1;

        } */


        // with log(b) time complexity
        // a to pow b is equal to a*a to pow of (b-1) iof b is odd or (a*a) pow of (b/2)
        while(b>0){

            if((b&1) != 0){ // which means not odd (with the help of bitwise and)
                res = res * a;
            }
            a=a*a;
            b=b/2;

        }
        return res;
    }
}
