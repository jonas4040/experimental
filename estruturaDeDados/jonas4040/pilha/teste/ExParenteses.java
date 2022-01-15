package jonas4040.pilha.teste;

import java.util.Stack;
import java.util.Scanner;

public class ExParenteses{
	public static void main(String[] args){
		String expressao=")A-C*(A+B)(";
		if(estaCorreta(expressao)){
			System.out.println("A expressao estah CORRETA");
		}else{
			System.out.println("A expressao estah INCORRETA, tem algo de errado com o(s) parentese(s)");
		}
	}
	
	public static boolean estaCorreta(String expressao){
		Stack<Character> expStack= new Stack<>();
		int qtdParAbre=0, qtdParFecha=0;
		
		for(int j=0;j<expressao.length();j++){
			expStack.push(expressao.charAt(j));
		}
		
		for(int i=0;i<expressao.length();i++){
			if(expressao.charAt(i)==')'){
				qtdParFecha++;
			}else if(expressao.charAt(i)=='('){
				qtdParAbre++;
			}
			
			if(expStack.peek()!='(' || expStack.peek()!=')'){
				expStack.pop();	
				//System.out.println(expStack);
			}else if(expressao.contains("()")){//se na string tiver "()"
				expStack.pop();
			}
		}
		
		 //System.out.println("\n"+expStack);
		
		if(expStack.isEmpty() && (qtdParFecha==qtdParAbre || qtdParAbre==qtdParFecha)){
		    return true;
		}
		
		return false;
	}
}
