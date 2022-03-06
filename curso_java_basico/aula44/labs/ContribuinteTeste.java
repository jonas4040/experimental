package jonas4040.cursojavabasico.aula44.labs;

import java.util.Scanner;

public class ContribuinteTeste {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Contribuinte jonas = new Contribuinte("Jonas", 10000);
		/*Contribuinte empresaX= new PessoaJuridica("Coca-Cola",90000.03);
		Contribuinte pessoaA= new PessoaFisica("Carla", 1400);
		
		Contribuinte empresaY= new PessoaJuridica("Henkel",100000.74);
		Contribuinte pessoaB= new PessoaFisica("Joao", 2800);
		
		Contribuinte empresaZ= new PessoaJuridica("Zara",4570000.97);
		Contribuinte pessoaC= new PessoaFisica("Ioseph", 3600);*/
		
		Contribuinte mom = new PessoaFisica();
		mom.setNome(leNome(sc));
		mom.setRendaBrutaAnual(leSalario(sc));
		
		System.out.println(" \t\t-----------IRPF------------ ");
		System.out.println(mom);
		System.out.println(" \t\t------------***----------- ");
	}
	
	public static String leNome(Scanner sc) {
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		return nome;
	}
	
	public static double leSalario(Scanner sc) {
		System.out.print("Digite seu salario: ");
		double salario = sc.nextDouble();
		return salario;
	}
}
