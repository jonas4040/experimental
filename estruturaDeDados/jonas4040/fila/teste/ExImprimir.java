package jonas4040.fila.teste;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class ExImprimir{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Queue<String> documento= new LinkedList<>();
		documento.add("Foo.pdf");
		documento.add("document(1).docx");
		documento.add("photo.jpg");
		documento.add("document.pdf");
		documento.add("worksheet.xlsx");
		
		System.out.print("Digite 1 para imprimir os documentos pendentes ou 0 para sair: ");
		int resposta=sc.nextInt();
		
		while(resposta!=0){
			imprimir(documento);
			System.out.print("Digite 1 para imprimir os documentos pendentes ou 0 para sair: ");
			resposta=sc.nextInt();
		}
	}
	
	public static void imprimir(Queue<String> documentos){
		while(!documentos.isEmpty()){
			System.out.println("Imprimindo "+documentos.peek());
			documentos.remove();
			System.out.println("O que falta imprimir: "+documentos);
		}
	}
}
