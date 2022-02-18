package jonas4040.mapa.teste;

import jonas4040.mapa.Carro;

public class CarroTeste{
	public static void main(String[] args){
		Carro uno= new Carro("Fiat Uno","Pink");
		uno.setAno(1996);
		uno.setDono("Castromendes Nunes");
		
		System.out.println(uno);
	}
}
