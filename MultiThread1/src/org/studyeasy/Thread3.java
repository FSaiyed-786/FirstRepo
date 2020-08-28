package org.studyeasy;


public class Thread3 {
	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException  {
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					Thread3.counter++;
				  					
				}
				System.out.println("The loopsin thread1 is over");
			}
			
		});
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1;1<=1000;i++) {
					Thread3.counter++;
					
				}
			}
			
		});
		
	th1.start();
	th2.start();
	Thread.sleep(2000);
	System.out.println("The value of counter is "+ Thread3.counter);

	}

	

}
