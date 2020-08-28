package org.studyeasy;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String season;
		int month=4;
		
			if ( month == 12 || month == 01 || month == 02)
				season ="Winter";
			else if (month == 4 || month== 5 || month==6)
			 season = "Summer";
			else if (month == 7 || month == 8 || month ==9)
				season ="Rainy";
				else if (month == 10 || month == 11)
					season ="Autumn";
				else season = ("Bogus month");
			System.out.println("The month selected us "+ season);
			

	}

}
