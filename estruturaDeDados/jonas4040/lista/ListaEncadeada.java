package jonas4040.lista;

import jonas4040.lista.No;

public class ListaEncadeada<T>{
	private No<T> inicio;
	private int tamanho = 0;
	
	public void adicionar(T elemento){
		No<T> celula = new No<T>(elemento);//this is a new node
		this.inicio=celula;
		tamanho++;
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Lista Encadeada [inicio= ").append(inicio).append("]");
		return str.toString();
	}
}
