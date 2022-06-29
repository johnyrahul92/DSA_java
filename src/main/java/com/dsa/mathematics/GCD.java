package com.dsa.mathematics;

public class GCD {
    public static void main(String[] args) {
        

        // Using euclid Mathematics

        // gcd(a,b) => gcd(a-b,b) where a> b which can derved to gcd(a,b) => gcd(b,a%b)
        int a = 50, b = 25;
        System.out.println(gcd(a,b));        
    }

    private static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
        
    }
}
