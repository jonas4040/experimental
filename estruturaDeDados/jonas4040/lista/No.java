package jonas4040.lista;

public class No<T>{
	private T elemento;
	private No<T> proximo;
	
	public No(T elemento){
		this.elemento=elemento;
		this.proximo=null;
	}
	
	public No(T elemento,No<T> proximo){
		this.elemento=elemento;
		this.proximo=proximo;
	}
	
	public No(){
	
	}
	
	//getters & setters
	private T getElemento(){
		return this.elemento;
	}
	private No<T> getProximo(){
		return this.proximo;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("No [elemento= ").append(elemento).append(", proximo= ").append(proximo).append("]");
		return str.toString();
	}
}
