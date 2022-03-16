package jonas4040.aula47.labs;

public class ContatoNaoExisteException extends Exception{
	public ContatoNaoExisteException() {
		
	}
	
	public ContatoNaoExisteException(String msg) {
		System.out.println(msg);
	}
}
