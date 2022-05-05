package com.dsa.general;

public class DotProduct {

	public static void main(String[] args) {
		int vect_A[] = { 3, -5, 4 };
        int vect_B[] = { 2, 6, 5 };
        System.out.print("Dot product:");
        int product = 0;
        for(int i = 0; i < vect_A.length; i++) {
        	product = product + vect_A[i] * vect_B[i];
        }
        System.out.println(product);
	}
}
