package Tasks11thmay;

public class ThreadsDemo extends Thread{

	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println("extends thread:"+i);
		}
	}
	public static void main(String[] args) {

		ThreadsDemo aobj =new ThreadsDemo();
		aobj.start();
		Thread t1=new Thread();
		t1 .run();
	}


}
