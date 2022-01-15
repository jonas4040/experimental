package jonas4040.fila;

import jonas4040.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	public Fila(){
		super();
	}
	public Fila(int capacidade){
		super(capacidade);
	}
	
	public void enfileirar(T elemento){
		this.adicionar(elemento);
	}
	
	public T espiar(){//retorna o elemento no inicio da fila
		if(!this.estaVazia()){
			return this.elementos[0];
		}else{
			return null;
		}	
	}
	
	public T desenfileirar(){
		T elemento=null;
		if(!this.estaVazia()){
			elemento=this.elementos[0];
			this.remover(0);
		}
		return elemento;
	}
}
