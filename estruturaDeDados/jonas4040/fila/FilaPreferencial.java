package jonas4040.fila;

//TODO ISSUE nao adiciona nenhum elemento, pois a lista estah vazia

public class FilaPreferencial<T> extends Fila<T>{//Fila com Prioridade
	public FilaPreferencial(int capacidade){
		super(capacidade);
	}

	//Sobrescrevendo
	public void enfileirar(T elemento){
		Comparable<T> chave= (Comparable<T>) elemento;
		int i;
		if(this.estaVazia()){
		for(i=0;i<this.elementos.length;i++){
			if(elemento.equals(this.elementos[i]) && chave.compareTo(this.elementos[i])==0){//compara o elemento passado no metodo com todos os elementos da fila
				break;
			}
		}
		this.adicionar(i,elemento);//adiciona elemento na posicao
		System.out.println(elemento);
		}
	}
}
