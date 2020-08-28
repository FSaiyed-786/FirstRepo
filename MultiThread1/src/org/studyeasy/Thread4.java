package org.studyeasy;

class Brakets {
	synchronized public void generate() {
		for(int i=1;i<=10;i++) {
		
			if (i<=5) {
				System.out.println("[");
			} else {
				System.out.println("]");
			}
			
		}
		System.out.println();
	}
	
	
}

public class Thread4 {

	public static void main(String[] args) {
		final Brakets brackets = new Brakets();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					brackets.generate();
				}
				
			}
			
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					brackets.generate();
				}
			}
			
		}).start();
		

	}

}
