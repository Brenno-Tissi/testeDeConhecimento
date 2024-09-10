package entities;

public class Usuarios {
	
	private int id; 
    private String nome ;
    private int idade;
    private String email;
    private int telefone;
    private String endereco;
    private int dataCadastro;
    private String ativo;
    private double salario;
    
	public Usuarios(int id, String nome, int idade, String email, int telefone, String endereco, int dataCadastro,
			String ativo, double salario) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
		this.ativo = ativo;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(int dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "usuarios [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", telefone="
				+ telefone + ", endereco=" + endereco + ", dataCadastro=" + dataCadastro + ", ativo=" + ativo
				+ ", salario=" + salario + "]";
	}

	

}
