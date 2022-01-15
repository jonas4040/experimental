import java.util.Scanner;

public class AreaCirculo{//exercicio 1002 URI
	public static void main(String[] args){
		double A, PI=3.14159, raio;
		Scanner sc = new Scanner(System.in);
		
		raio=sc.nextDouble();
		A=PI*Math.pow(raio,2);
		
		System.out.printf("A= %.4f\n",A);
		sc.close();
	}
}
