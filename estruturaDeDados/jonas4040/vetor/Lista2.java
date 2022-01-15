package jonas4040.vetor;

import jonas4040.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{
	Lista2(){
		super();
	}
	
	Lista2(int capacidade){
		super(capacidade);
	}
	
	public boolean adicionar(T elemento){
		return super().adicionar(elemento);
	}
	
	public boolean adicionar(int posicao,T elemento){
		return super().adicionar(posicao,elemento);
	}
	
	
}
