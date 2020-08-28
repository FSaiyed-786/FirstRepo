package org.studyeasy;

public class Thread9 {
	static public int balance=0;
	public void withdraw(int amount) {
		synchronized(this) {
			if(balance<=0) {
				System.out.println("Waiting for balance updation");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			balance=balance-amount;
			System.out.println("Withdrawal successful and balance is "+ balance);
		}	
	}

	public static void main(String[] args) {
		final Thread9 th = new Thread9();
		Thread thread1 = new Thread(new Runnable() {
				@Override
				public void run() {
					th.withdraw(1000);
					
				}
	       }); 
		thread1.start();
	}

}
