package jonas4040.aula71.labs;

public class CadeiraTeste {

	public static void main(String[] args) {
		Cadeira cadeira = new Cadeira();
		CadeiraThread tPessoa1 = new CadeiraThread("Joao Carlinhos");
		CadeiraThread tPessoa2 = new CadeiraThread("Maria Cantareira");
		
		Thread t1 = new Thread(tPessoa1);
		//t1.setPriority(5);
		Thread t2 = new Thread(tPessoa2);
		//t2.setPriority(1);
		//Thread t2 = new Thread("T2");
		
		/*try{
			t1.join();
			t2.join();
		//t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}*/
		t1.start();
		t2.start();
		//t3.start();
		
	}

}
