package org.studyeasy;

import java.io.IOException;

public class isPrime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		num=14;
		char choice;
		System.out.println("Enter number to chk whether its prime" );
		choice = (char) System.in.read();
		boolean Isprime = false;
		
		
		for(int i =2;i<=choice/i; i++) {
			if((choice%i) == 0) {
				Isprime = false;
				break;
			}
		}
		if (Isprime) System.out.println("IS Prime number");
		else System.out.println("Not prime number");

	}

}

