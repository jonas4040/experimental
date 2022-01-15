package jonas4040.pilha.teste;

import java.util.Stack;
import java.util.Scanner;

public class ExPalindromo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Stack<Character> palavra = new Stack<Character>();
		Stack<Character> meiaPalavra = new Stack<Character>();
			
		int i=0;
		char topo=' ';
		
		System.out.print("Digite a sequencia de caracteres: ");
		String PALAVRA=sc.nextLine();
		for(int j=0;j<PALAVRA.length();j++){
			palavra.push(PALAVRA.charAt(j));
		}
		
		//compara palindromos dividindo-os em duas pilhas
		while(i<(PALAVRA.length()/2)){//PALAVRA.charAt(i)==topo && 
			topo=palavra.peek();
			palavra.pop();
			meiaPalavra.push(topo);
			i++;
			//System.out.print("Foi executado "+i+" vezes");
		}
		
		if(PALAVRA.length()%2!=0){
			palavra.pop();
			if(meiaPalavra.equals(palavra)){
				System.out.println("Eh palindromo");
			}else{
				System.out.println("Nao eh palindromo");
			}
		}else{
			if(meiaPalavra.equals(palavra)){
				System.out.println("Eh palindromo");
			}else{
				System.out.println("Nao eh palindromo");
			}
		}
		
		System.out.println(palavra);
		System.out.println(meiaPalavra);		
	}
}
