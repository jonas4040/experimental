package jonas4040.lista;

public class No<T>{		//no ou celulas
	private T elemento;
	private No<T> proximo;
	private int indice;
	
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
	public T getElemento(){
		return this.elemento;
	}
	public No<T> getProximo(){
		return this.proximo;
	}
	
	public void setProximo(No<T> proximo){
		this.proximo=proximo;
	}
	
	public int getIndice(){
		return this.indice;
	}
	
	public void setIndice(int indice){
		this.indice=indice;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("No : elemento= ").append(elemento).append(", proximo= ").append(proximo).append("");
		return str.toString();
	}
}
