package teste_GFT;

public class Pessoa {
	String nome="Anderson";
	String endereco="São Paulo";
	String telefone="555-5555";
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
