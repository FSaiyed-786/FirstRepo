package org.studyeasy;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countme();
	}
   public void countme() {
	   for(int i=1;i<9;i++) {
		   try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println("The value of i is " + i + "and thread no is " + threadNo);
	   }
	   
   }
	
}

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		MyCounter mycounter1 = new MyCounter(1);
		MyCounter mycounter2 = new MyCounter(2);
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		mycounter1.start();
		System.out.println("#################");
		mycounter2.start();
		System.out.println("###############");
		Thread.sleep(4505);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process " + (endTime - startTime));
		
		

	}

}
