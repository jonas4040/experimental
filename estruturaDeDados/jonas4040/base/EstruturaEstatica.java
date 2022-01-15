package jonas4040.base;

public class EstruturaEstatica<T>{
	protected T[] elementos;
	protected int tamanho;
	
	public EstruturaEstatica(int capacidade){
		this.elementos= (T[]) new Object[capacidade];
		this.tamanho=0;
	}
	
	public EstruturaEstatica(){
		this(10);
	}
	
	public boolean estaVazia(){
		return this.tamanho == 0;
	}
	
	protected boolean adicionar(T elemento){
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
	protected boolean adicionar(int posicao,T elemento){
		if(!(posicao >=0 && posicao<tamanho)){//se a posicao for negativa e tamanho ultrapasar o limite do vetor
			throw new IllegalArgumentException("Posicao "+posicao+" invalida");
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
	
	protected void remover(int posicao){
		if(!(posicao >=0 && posicao<tamanho)){//se a posicao for negativa e tamanho ultrapasar o limite do vetor
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int i=posicao;i<this.tamanho-1;i++){
			this.elementos[i]=this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	protected void aumentarCapacidade(){
		if(this.tamanho==this.elementos.length){
			T[] novosElementos = (T[]) new Object[this.elementos.length*2];
			for(int i=0;i<this.elementos.length;i++){
				novosElementos[i]=this.elementos[i];
			}
			this.elementos=novosElementos;
		}
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
