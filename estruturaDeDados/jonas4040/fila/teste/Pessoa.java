package jonas4040.fila.teste;

public class Pessoa{
	public Pessoa(String tipoPessoa){
		if(tipoPessoa.equals("idoso") || tipoPessoa.equals("gestante")){//se a pessoa = idoso ou gestante dar mais prioridade
			this.prioridade=1;//dar mais prioridade
		}else{
			this.prioridade=2;//dar menos prioridade
		}
		this.tipoPessoa = tipoPessoa;
	}	
	
	private String tipoPessoa;
	private int prioridade;
	
	public String getTipoPessoa(){
		return this.tipoPessoa;
	}
	
	public int getPrioridade(){
		return this.prioridade;
	}
	
	public String toString(){
		return this.getTipoPessoa();
	}
}
