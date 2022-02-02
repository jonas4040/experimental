package jonas4040.lista;

import jonas4040.lista.No;

public class ListaEncadeada<T>{
	private No<T> inicio;
	private No<T> fim;								//este eh o ultimo elemento	
	private int tamanho = 0;
	//private int totalElementos;
	
	public void adicionar(T elemento){			//add no inicio da lista
		if(tamanho == 0){//se estiver vazia a lista
			No<T> celula = new No<T>(elemento);		//this is a new node
			this.inicio=celula;
			this.fim=celula;
			
		}else{
			No<T> celula = new No<T>(elemento,this.inicio);
			//this.inicio.setAnterior(celula);
		}
		tamanho++;
		
	}
	
	public boolean adicionarChangeName(T elemento){		//add no final na lista
		return false;
	}
	
	public int adicionarMudarNome(int posicao){
		return posicao;
	}			
	
	//insere elemento de forma ordenada		
	
	public T percorrerLista(){						//percorre a lista, pega o elemento(get) e TODO pode ser que imprima.
		return null;
	}
	
	public void limpar(){
	
	}
	
	public T buscar(int posicao){					//pesquisa um elemento numa posicao especifica
		return null;
	}
	
	public T remover(){return null;}//remove do inicio/primeiro
	
	public T removerChangeName(){return null;}//remove do fim/ultimo
	
	public void removerMudarNome(int posicao){			//remove de qualquer posicao
	
	}
	
	public boolean contem(T elemento){
		return false;	
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public void setAnterior(No<T> celula){						//setter para attr inicio
		this.inicio=celula; 
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Lista Encadeada : inicio= ").append(inicio).append("");
		return str.toString();
	}
}
