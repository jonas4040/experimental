//import ;

public class Aluno{
	private String nome;
	private long matricula;
	private int[] nota;
	
	public Aluno(){}
	
	public Aluno(String nome, long matricula, int[] nota){
		this.nome=nome;
		this.matricula=matricula;
		
		this.nota=nota;
	}
	
	//getters & setters
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	public long getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(long matricula){
		this.matricula=matricula;
	}
	
	public int[] getNotas(){
		return this.nota;
	}
	
	public void setNota(int[] nota){
		this.nota=nota;
	}
	
	@Override
	public String toString(){
		String str = "Alunos: "+nome+" , "+matricula+"\n"+
						"\t\tNota 1"+nota[0]+"\n"+
						"\t\tNota 2"+nota[1]+"\n"+
						"\t\tNota 3"+nota[2]+"\n"+
						"\t\tNota 4"+nota[3]+"\n";
		return str;
	}
	
}
