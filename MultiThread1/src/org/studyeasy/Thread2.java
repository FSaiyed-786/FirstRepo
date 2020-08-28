package org.studyeasy;

import java.util.Random;

class Mycounter1 implements Runnable {
	private int ThreadNo;

	public Mycounter1(int threadNo) {
		super();
		ThreadNo = threadNo;
	}
	@Override
	public void run() {
		Random random = new Random();
		for(int i=0;i<9;i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is "+ i+ "and threadNo is " + ThreadNo);
			
			
		}
		
	}
	
	
}

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<10;i++) {
					try {
					
					Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};
					System.out.println(i);
				}
				
			}
			
		} ).start();

	}

}
