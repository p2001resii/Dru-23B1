package Tasks11thmay;

public class ThreadDemo2 implements Runnable {

	public void run() {
		System.out.println("implementing runnable interface");{
			for(int i=1;i<=5;i++) {
				System.out.println("child class");
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo2 bobj=new ThreadDemo2();
		Thread t2=new Thread(bobj);
		t2.start();
		//t2.run();
		for(int i=0;i<=5;i++) {
			System.out.println("parent class");
		}
	}
}