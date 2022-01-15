package jonas4040.livrosdabiblioteca.test;

import java.util.ArrayList;
import jonas4040.livrosdabiblioteca.Livro;

public class LivroTestDrive{
	public static void main(String[] args){
		ArrayList<Livro> lista= new ArrayList<>();
		lista.add(new Livro(1,"Java Fundamentals","Henry Techt"));
		lista.add(new Livro(2,"Learning Fofoca News Script","Alvaro Mendes"));
		
		//System.out.printf("Livros\n"+lista+"\n");
		System.out.println(lista.toString());
	}
}
