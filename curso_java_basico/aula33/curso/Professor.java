//import ;

public class Professor{
	private String nome;
	private String dept;
	private String email;
	
	public Professor(){}
	
	public Professor(String nome, String email,String dept){
		this.nome=nome;
		this.email=email;
		this.dept=dept;
	}
	
	//getters & setters
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getDept(){
		return this.dept;
	}
	
	public void setDept(String dept){
		this.dept=dept;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	@Override
	public String toString(){
		String str = "Professor "+nome+" , "+email+", Departamento de "+dept+"\n";
		return str;
	}
}
