package jonas4040.vetor;

import java.util.Arrays;

public class Vetor<T>{
	private T[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade){
		this.elementos= (T[]) new Object[capacidade];
		this.tamanho=0;
	}
	
	//adiciona elementos no final do vetor e nao retorna nada
	/*public void adicionar(T elemento){
		for(int i=0;i<this.elementos.length;i++){//itera/percorre todo o vetor
			if(this.elementos[i]==null){//se nesta posicao i nao tiver nada
				this.elementos[i]=elemento;//adiciona um elemento
				break;//e para por ai
			}
		}
	}*/
	
		//TODO pode por para retornar true se eh possivel adicionar e retornar false se nao add nada
	/*public void adicionar(T elemento) throws Exception{
		if(this.tamanho<this.elementos.length){//verifica se nao ultrapassou os limites do tamanho do vetor
			this.elementos[this.tamanho]=elemento;
			this.tamanho++;
			
			//System.out.println("Elemento adicionado");
			//return true;
		}else{
			//return false;
			throw new Exception("O vetor ja esta cheio, nao eh possivel adicionar mais elementos");
		}
	}*/
	
	public boolean adicionar(T elemento){
		this.aumentarCapacidade();
		if(this.tamanho<this.elementos.length){//verifica se nao ultrapassou os limites do tamanho do vetor
			this.elementos[this.tamanho]=elemento;
			this.tamanho++;
			
			//System.out.println("Elemento adicionado");
			return true;
		}
			System.out.println("O vetor ja esta cheio, nao eh possivel adicionar mais elementos");
			return false;
		
	}
	
	//Overload
	public boolean adicionar(int posicao,T elemento){
		if(!(posicao >=0 && posicao<tamanho)){//se a posicao for negativa e tamanho ultrapasar o limite do vetor
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		this.aumentarCapacidade();
		
		//mover todos os elementos
		for(int i=tamanho;i>=posicao;i--){
			this.elementos[i+1]=this.elementos[i];
		}
		
		this.elementos[posicao]=elemento;
		this.tamanho++;
		
		return true;
	}
	
	public void remover(int posicao){
		if(!(posicao >=0 && posicao<tamanho)){//se a posicao for negativa e tamanho ultrapasar o limite do vetor
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int i=posicao;i<this.tamanho-1;i++){
			this.elementos[i]=this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void remover(T elemento){
		this.remover(this.buscar(elemento));
	}
	
	public void limpar(){
		//remove todos os elementos da lista
		/*if(!(posicao >=0 && posicao<tamanho)){//se a posicao for negativa e tamanho ultrapasar o limite do vetor
			throw new IllegalArgumentException("Posicao invalida");
		}*/
		for(int i=0;i<this.tamanho;i++){
			this.elementos[i]=null;
			this.tamanho=0;
		}
	}
	
	private void aumentarCapacidade(){
		if(this.tamanho==this.elementos.length){
			T[] novosElementos = (T[]) new Object[this.elementos.length*2];
			for(int i=0;i<this.elementos.length;i++){
				novosElementos[i]=this.elementos[i];
			}
			this.elementos=novosElementos;
		}
	}
	
	public T buscar(int posicao){
		if(!(posicao >=0 && posicao<tamanho)){//se a posicao for negativa e tamanho ultrapasar o limite do vetor
			throw new IllegalArgumentException("Posicao invalida");
		}
		return this.elementos[posicao];
	}
	
	//Override
	public int buscar(T elemento){//antes retornava boolean
		for(int i=0;i<this.tamanho;i++){//percorre ate o tamanho real do vetor
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public int ultimoIndiceDe(T elemento){
		int posicao=-1;
		/*for(int i=0;i<this.tamanho;i++){//percorre ate o tamanho real do vetor
			if(this.elementos[i].equals(elemento)){
				posicao = i;
			}
		}
		return posicao;*/
		for(int i=this.tamanho-1;i>=0;i--){//percorre ate o tamanho real do vetor
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public int tamanho(){//nao eh um getter pois o usuario nao pode ter acesso a essa variavel
		return this.tamanho;
	}
	
	//@Override
	public String toString(){
		StringBuilder str =  new StringBuilder();
		str.append("[");
		
		for(int i=0;i<this.tamanho-1;i++){//acessa a ultima posicao
			str.append(this.elementos[i]);//'adiciona' na string um elemento
			str.append(", ");
		}
		
		if(this.tamanho>0){
			str.append(this.elementos[this.tamanho-1]);
		}
		
		str.append("]");
	
		return str.toString();
	}
}
