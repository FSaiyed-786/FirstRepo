package org.studyeasy;


	
	class Brakets1{
		
		private Object lock = "Lock";
		void generate() {
			synchronized(lock) {
				for(int i=1;i<=10;i++) {
				  try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  if (i<=5) {
					  System.out.println("[");
				  } else {
					  System.out.println("]");
				  }
				}
				System.out.println();
			}
			 for(int j=1;j<=10;j++) {
				 try {
					Thread.sleep(25);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
				 
			
		}
		
		
	}

	public class Thread5 {
	public static void main(String[] args) {
		final Brakets1 brackets = new Brakets1();
		new Thread (new Runnable() {
			@Override
			public void run() {
				long Starttime = System.currentTimeMillis();
				for(int i=1;i<=5;i++) {
					brackets.generate();
				}
				long Endtime = System.currentTimeMillis();
				System.out.println("Time required for thread1 was " + (Endtime-Starttime));
			}
			
		}).start();
		
		new Thread(new Runnable()
				{
			 @Override
			 public void run() {
			  long startTime = System.currentTimeMillis();
			  for(int i =1;i<=5;i++) {
				  brackets.generate();
				  
			  }
			  long Endtime = System.currentTimeMillis();
			  System.out.println("Time required for thread2 was" + (Endtime - startTime));
			  }
				}).start();
		
		

	}

}
