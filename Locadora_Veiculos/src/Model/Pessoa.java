package Model;

import java.sql.Date;

public class Pessoa {
	private int codigo;
	private String nome;
	private int idade;
	private String email;
	private int cpf;
	private String sexo;
	private int telefone;
	private String rua;
	private String bairro;
	private String cidade;
	private int numero;
	private int cep;
	private String estado;
	private Date datanasc;
	private String categoriacnh;
	private int numerocnh;
	private String login;
	private String senha;
	private String tipo;

	public Pessoa() {
	}

	public Pessoa(String nome, int cpf, String sexo, Date datanasc, String email, int telefone, int cep,
			String rua, int numero, String bairro, String cidade, String estado, String categoriacnh,
			int numerocnh, String login, String senha, String tipo) {

		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.datanasc = datanasc;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.categoriacnh = categoriacnh;
		this.numerocnh = numerocnh;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanascimento(Date datanasc) {
		this.datanasc = datanasc;
	}

	public String getCategoriacnh() {
		return categoriacnh;
	}

	public void setCategoriacnh(String categoriacnh) {
		this.categoriacnh = categoriacnh;
	}

	public int getNumerocnh() {
		return numerocnh;
	}

	public void setNumerocnh(int numerocnh) {
		this.numerocnh = numerocnh;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
