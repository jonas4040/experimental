package jonas4040.lista;

import jonas4040.lista.No;

public class ListaEncadeada<T>{
	private No<T> inicio;
	private No<T> fim;								//este eh o ultimo elemento	
	private int tamanho = 0;
	//private int totalElementos;
	
	public void addComeco(T elemento){			//add no inicio da lista
		No<T> celula = new No<T>(elemento,this.inicio);
		this.inicio = celula;
		
		if(tamanho == 0){//se estiver vazia a lista
			//No<T> celula = new No<T>(elemento);		//this is a new node
			this.fim=this.inicio;
			//this.inicio.setIndice(0);
			
		}//else{
			//No<T> celula = new No<T>(elemento,this.inicio);
			//this.inicio.setAnterior(celula);
		//}
		
		tamanho++;
		this.fim.setIndice(tamanho-1);
		//System.out.println(this.fim.getIndice());
		
	}
	
	public void adicionar(T elemento){		//add no final na lista
		if(tamanho==0){
			this.addComeco(elemento);
		}else{
			No<T> celula = new No<>(elemento);
			this.fim.setProximo(celula);
			this.fim=celula;
			this.fim.setIndice(tamanho);
			tamanho++;
		}
		//return false;
		//System.out.println(this.fim.getIndice());
	}
	
	public int adicionar(int posicao,T elemento){
		return posicao;
	}			
	
	//TODO inserir elemento de forma ordenada
	
	public void limpar(){
		No<T> atual = inicio;
		while(this.tamanho>0){
			atual.setProximo(null);
			this.tamanho--;
		}
	}
	
	public T buscar(int posicao){			//pesquisa um elemento numa posicao especifica 
											//TODO reorganizar os indices depois que insere no comeco
		No<T> atual = inicio;
		while(atual != null){
			if(atual.getIndice() == posicao){
				return atual.getElemento();
			}
			atual=atual.getProximo();
		}
		
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
	
	//
	
	@Override
	public String toString(){
		if(this.tamanho==0){
			return "[]";
		}
		No<T> atual = inicio;
		StringBuilder str = new StringBuilder("Lista Encadeada : ");
		
		//percorrendo a lista
		while(atual != null){
			str.append(atual.getElemento());
			str.append(", ");
			atual=atual.getProximo();
		}
		
		//ultimo elemeno
		//str.append(atual.getElemento());
		str.append(".");
		return str.toString();
	}
}
