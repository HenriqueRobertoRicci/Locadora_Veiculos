package Model;

public class Bicicleta {
	private int codigo;
	private String marca;
	private String cor;
	private int qtdmarchas;
	private int tamanhoaro;
	private String tipodeuso;
	private String tipofreio;
	private double preco;

	public Bicicleta() {

	}

	public Bicicleta(String marca, String cor, int qtdmarchas, int tamanhoaro, String tipodeuso, String tipofreio,
			double preco) {

		this.marca = marca;
		this.cor = cor;
		this.qtdmarchas = qtdmarchas;
		this.tamanhoaro = tamanhoaro;
		this.tipodeuso = tipodeuso;
		this.tipofreio = tipofreio;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdmarchas() {
		return qtdmarchas;
	}

	public void setQtdmarchas(int qtdmarchas) {
		this.qtdmarchas = qtdmarchas;
	}

	public int getTamanhoaro() {
		return tamanhoaro;
	}

	public void setTamanhoaro(int tamanhoaro) {
		this.tamanhoaro = tamanhoaro;
	}

	public String getTipodeuso() {
		return tipodeuso;
	}

	public void setTipodeuso(String tipodeuso) {
		this.tipodeuso = tipodeuso;
	}

	public String getTipofreio() {
		return tipofreio;
	}

	public void setTipofreio(String tipofreio) {
		this.tipofreio = tipofreio;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void cadastrarBicicleta(Bicicleta novaBicicleta) {
		FornecedorBD fbd = new FornecedorBD();
		fbd.inserirBicicleta(novaBicicleta);
	}
}
