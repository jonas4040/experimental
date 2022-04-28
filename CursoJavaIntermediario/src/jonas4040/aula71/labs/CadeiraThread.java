package jonas4040.aula71.labs;

public class CadeiraThread implements Runnable{
	
private String quemEstaSentado = "ninguem";
	
	public CadeiraThread(String quemEstaSentado) {
		this.quemEstaSentado = quemEstaSentado;
	}

	/*public String getSentado() {
		return this.quemEstaSentado;
	}*/
	public synchronized String pessoaNaCadeira(String nome) {
		this.quemEstaSentado=nome;
		return this.quemEstaSentado;
	}

	@Override
	public void run() {
		System.out.println("Uma pessoa cujo nome eh comprido esta prestes a sentar na cadeira, "+this.pessoaNaCadeira(quemEstaSentado));
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.pessoaNaCadeira(quemEstaSentado)+" chegou e sentou");
	}
	
}
