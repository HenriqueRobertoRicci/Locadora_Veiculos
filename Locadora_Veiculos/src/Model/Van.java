package Model;

public class Van {
	private int codigo;
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	private String cor;
	private String tipodirecao;
	private int qtdlugares;
	private String tipocambio;
	private int renavam;
	private double preco;

	public Van() {

	}

	public Van(String modelo, String marca, int ano, String placa, String cor, String tipodirecao, int qtdlugares,
			String tipocambio, int renavam, double preco) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.tipodirecao = tipodirecao;
		this.qtdlugares = qtdlugares;
		this.tipocambio = tipocambio;
		this.renavam = renavam;
		this.preco = preco;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public String getTipodirecao() {
		return tipodirecao;
	}

	public void setTipodirecao(String tipodirecao) {
		this.tipodirecao = tipodirecao;
	}

	public int getQtdlugares() {
		return qtdlugares;
	}

	public void setQtdlugares(int qtdlugares) {
		this.qtdlugares = qtdlugares;
	}

	public String getTipocambio() {
		return tipocambio;
	}

	public void setTipocambio(String tipocambio) {
		this.tipocambio = tipocambio;
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

	public void cadastrarVan(Van novaVan) {
		FornecedorBD fbd = new FornecedorBD();
		fbd.inserirVan(novaVan);

	}
}
