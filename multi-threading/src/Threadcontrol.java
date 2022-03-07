
public class Threadcontrol extends Thread {

	public Threadcontrol(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(true) {
			System.out.println(name);
			Thread.yield();
//			try {
//				Thread.sleep(1);
//			}catch(InterruptedException e) {}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Threadcontrol("Hello");
		Thread t2 = new Threadcontrol("World");
		
		t1.start();
		t2.start();
	}

}
