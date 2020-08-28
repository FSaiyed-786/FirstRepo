package org.studyeasy;

class Brakets6 {
	
	synchronized  static public void  generate(String threadCode) {
		for(int i=1;i<=10;i++) {
			if(i<=5) {
				System.out.println("[");
			} else {
				System.out.println("]");
			}
			
		}
		System.out.println("Generated by ThreadCode" + threadCode);
		
	}
}

public class Thread6 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=1;i<=5;i++) {
					Brakets6.generate("Thread 1");
										
				}
				
			}
			
			
		}).start();;
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=1;i<=5;i++) {
					Brakets6.generate("Thread 2");
				}
			}
			
		}).start();
				
		
	}

}