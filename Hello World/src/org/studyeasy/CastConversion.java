package org.studyeasy;

public class CastConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte b;
     int a = 257;
    double d = 323.132;
      
      //Converting integer to byte;
    b= (byte) a;
    System.out.println("Converting integer to byte" + b);
      
      //conerting float to integer
    a = (int) d;
    	  System.out.println("Converting float to integer"+ a);
    		  
    //converting double to byte
       b = (byte) d;
     System.out.println("Converting double to byte"+ b);
      
		
	}

}
