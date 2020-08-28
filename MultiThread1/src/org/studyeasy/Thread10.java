package org.studyeasy;

public class Thread10 {
	static public int balance = 5000;
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0 || balance < amount) {
				System.out.println("Waiting for blance updation");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Original balance is "+ balance);
					System.out.println("Withdrawn amount "+ amount);
					balance=balance-amount;
					System.out.println();
					System.out.println("Withdrawal successful and current balance is "+ balance);
				}
			} else {
				System.out.println("We are inside else");
			}
			
		}
		
	}
    public void depoist(int amount) {
    	System.out.println("We are depositing the amount" + amount);
    	balance=balance+amount;
    	
    	
    }
	public static void main(String[] args) {
		final Thread10 th = new Thread10();
		final Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				th.withdraw(1000);
				
			}
				
	});
		thread1.start();
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				th.depoist(2000);
				thread1.interrupt();
				
			}
			  
			
		});
		thread2.start();
	}

}
