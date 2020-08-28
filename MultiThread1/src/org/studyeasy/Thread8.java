package org.studyeasy;

public class Thread8 {
  static public int balance=0;
  public void withdraw(int amount) {
	  synchronized (this) {
		  if (balance<=0) {
			  System.out.println("Waiting for balance updation");
			  try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	  }
	  balance= balance-amount;
	  System.out.println("Withdrawal successful, Current balance is "+ balance);
	  
  }
   public void deposit(int amount) {
	   System.out.println("We are depositing amount");
	   balance= balance+amount;
	   synchronized(this) {
		   notify();
	   }
   }
  
	public static void main(String[] args) {
		final Thread8 th = new Thread8();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				th.withdraw(1000);
				
			}
				
		});
		
		thread1.setName("Thread1");
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
				
				th.deposit(2000);
				
			}
			
		});
		
		thread2.setName("Thread");
		thread2.start();
		

	}

}
