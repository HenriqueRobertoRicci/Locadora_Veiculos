package Model;

public class Moto {
	private int codigo;
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private String cor;
	private String categoria;
	private String tipofreio;
	private int renavam;
	private double preco;

	public Moto() {

	}

	public Moto(String marca, String modelo, int ano, String placa, String cor, String categoria, String tipofreio,
			int renavam, double preco) {

		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.categoria = categoria;
		this.tipofreio = tipofreio;
		this.renavam = renavam;
		this.preco = preco;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipofreio() {
		return tipofreio;
	}

	public void setTipofreio(String tipofreio) {
		this.tipofreio = tipofreio;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void cadastrarMoto(Moto novaMoto) {
		FornecedorBD fbd = new FornecedorBD();
		fbd.inserirMoto(novaMoto);
	}
}
