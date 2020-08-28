package org.studyeasy;

public class midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i, j;
			i = 100;
			j = 200;
			// find midpoint between i and j
			while(++i < --j) ; // no body in this loop
			System.out.println("Midpoint is " + i);
	}

}
