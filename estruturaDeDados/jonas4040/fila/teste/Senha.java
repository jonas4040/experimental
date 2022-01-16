package jonas4040.fila.teste;

public class Senha{
	private int numero;
	private boolean ehSenhaPrior;//se eh senha prioritaria
	
	public Senha(int numero, boolean ehSenhaPrior){
		this.ehSenhaPrior=ehSenhaPrior;
		this.numero=numero;
	}
	
	public Senha(){}
	
	public int getNumero(){
		return this.numero;
	}
	
	public boolean getEhSenhaPrior(){
		return this.ehSenhaPrior;
	}
	
	public String toString(){
		return " "+this.numero;
	}
}
