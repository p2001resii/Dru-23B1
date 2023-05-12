package Tasks11thmay;

public class DeadlockExample {

	public static void main(String[] args) {

		final String course1="java";
		final String course2="python";

		Thread t1=new Thread() {
			public void run() {

				synchronized(course1){
					System.out.println("thread1 locked on couse1");
					try {
						Thread.sleep(100);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					synchronized(course2){
						System.out.println("thread1 locked on course2");
					}
					System.out.println("no dead lock");
				}
			}
		};

		Thread t2=new Thread() {

			public void run() {
				synchronized(course2){
					System.out.println("thread1 locked on couse2");
					try {
						Thread.sleep(100);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					synchronized(course1){
						System.out.println("thread1 locked on course1");
					}
				}
					System.out.println("no dead lock");
				}
			};
			t1.start();
			t2.start();
		}
	}

