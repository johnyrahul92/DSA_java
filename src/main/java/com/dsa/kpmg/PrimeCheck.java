package com.dsa.kpmg;

public class PrimeCheck {

    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }else if(n%2==0){
            return false;
        }

        for (int i = 3; i < Math.sqrt(n); i+=2) {
            if (n % i == 0)
                return false;            
        }

        return true;
    }

    static int t=2;

    static boolean isPrimeRecursion(int n){

        
        if(n<=1){
            return false;
        }
        else if(n==t){
            return true;
        }else if(n%t==0){
            return false;
            
        }else{
            t++;
            return isPrimeRecursion(n);
        }
          

        
    }

    public static void main(String[] args) {
        System.out.println("Is Prime");

        // Time complexity O{sqrt(n)}
        System.out.println(PrimeCheck.isPrime(6));
        // Time complexity O(n)
        System.out.println(PrimeCheck.isPrimeRecursion(7));


    }
    
}
