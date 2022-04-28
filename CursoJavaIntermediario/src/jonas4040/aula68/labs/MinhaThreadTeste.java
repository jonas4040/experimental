package jonas4040.aula68.labs;

public class MinhaThreadTeste {

	public static void main(String[] args) {
		MinhaThread thread1= new MinhaThread("#1", 200);
		MinhaThread thread2= new MinhaThread("#2", 1200);
		MinhaThread thread3= new MinhaThread("#3", 900);
		
		Thread t1 = new Thread(thread1);
		t1.setPriority(3);
		
		Thread t2 = new Thread(thread2);
		t2.setPriority(5);
		
		Thread t3 = new Thread(thread3);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
