package jonas4040.pilha.teste;

import java.util.Stack;
import java.util.Scanner;

public class Ex1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Stack<Integer> pilha = new Stack<Integer>();
			
		int tamanho=4,elemento=0;
		for(int i=0;i<tamanho;i++){
			System.out.print("Digite o "+(i+1)+" elemento: ");
			elemento=sc.nextInt();
			
			if(elemento%2==0){
				pilha.push(elemento);
			}else if(elemento%2!=0){
				if(pilha.isEmpty()){
					System.out.println("A pilha estah vazia!");
				}else{
					pilha.pop();
				}
			}
		}
		
		if(!pilha.isEmpty()){//se a pilha nao estiver vazia
			for(int i: pilha){
				System.out.println("Desempilhando o elemento "+pilha.peek());
			}
		}
		System.out.println(pilha);		
	}
}
