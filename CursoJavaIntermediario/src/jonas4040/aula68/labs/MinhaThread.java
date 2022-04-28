package jonas4040.aula68.labs;

public class MinhaThread implements Runnable{
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome=nome;
		this.tempo=tempo;
		
		//Thread thread = new Thread(this);
		//thread.start();
	}

	@Override
	public void run() {
		System.out.println("Iniciando a thread "+this.nome+". . .");
		
		try {
			for(int i=0;i<tempo/100;i++) {//	milis/100 = times of counter
				System.out.println("Thread "+this.nome+"Contador: "+i);
				Thread.sleep(this.tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread "+this.nome+" terminada.");
	}
	
	
}
