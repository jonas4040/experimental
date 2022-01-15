package jonas4040.pilha;

import jonas4040.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	public Pilha(){
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	public void empilhar(T elemento){
		super.adicionar(elemento);
	}
	
	public T topo(){//retorna o elemento que estah no topo da pilha
		if(this.estaVazia()){
			return null;
		}
		return this.elementos[tamanho-1];
	}
	
	public T desempilhar(){
		if(this.estaVazia()){
			return null;
		}
		return this.elementos[--tamanho];//primeiro diminui tamanho depois acessa array
	}
}
