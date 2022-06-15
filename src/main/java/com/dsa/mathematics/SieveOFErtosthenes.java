package com.dsa.mathematics;

import java.util.Arrays;

public class SieveOFErtosthenes {
    

    public static void main(String[] args) {

        // To check if prime numbers in range.
        // Prime number is a number which have factors 1 and the number itself.
        // Normal to check the prime number we will check if the number is proper divisble by 2 to root(number). If its not divi
        //then the number is prime
        int n=20;
        boolean isNumPrime = checkNumberisPrime(n);
        System.out.println("The number : "+ n+ " isPrime " + isNumPrime);

        // But to find the prime numbers in raange we use this algoritham

        boolean[] isPrime = checkPrimeNumbersInRange(n);

        for (int i = 0; i <=n; i++) {
            System.out.println("The number : "+ i + " isPrime : "+ isPrime[i]);
            
        }

        
        
    }

    private static boolean[] checkPrimeNumbersInRange(int n) {
        boolean[] isPrime= new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0]= false;
        isPrime[1]= false;

        for (int i = 2; i * i< n; i++) {
            for (int j = i*2; j < isPrime.length; j+=i) {
                isPrime[j]= false;                
            }
            
        }

        return isPrime;
    }

    private static boolean checkNumberisPrime(int n) {

        for (int i = 2; i * i< n; i++) {

            if(n%i==0){
                return false;
            }
            
        }

        return true;
    }
}
