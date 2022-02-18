package jonas4040.mapa;

public class Carro{
	private String marca;
	private String cor;
	private int ano;
	private String dono;//nome do dono = ownner
	
	//construtores
	public Carro(){}
	
	public Carro(String marca, String cor){
		this.marca=marca;
		this.cor=cor;
	}
	
	//getters & setters
	
	public String getMarca(){
		return this.marca;
	}
	
	public void setMarca(String marca){
		this.marca=marca;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String cor){
		this.cor=cor;
	}
	
	public String getDono(){
		return this.dono;
	}
	
	public void setDono(String dono){
		this.dono=dono;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public void setAno(int ano){
		this.ano=ano;
	}
	
	//@Override
	public String toString(){
		StringBuilder str = new StringBuilder("Carro: ");
		str.append(this.marca).
		append(",").
		append(this.cor).
		append("\n Ano: ").
		append(this.ano).
		append("\n Nome do dono: ").
		append(this.dono).
		append("\n---------------");
		return str.toString();
	}
}
