package Controller;

import Model.Fornecedor;
import Model.Pessoa;
import Model.Usuario;
import View.TelaFornecedor;

public class ControllerFornecedor {
	public void mostrarTelaFornecedor() {
		TelaFornecedor tf = new TelaFornecedor();
		tf.setVisible(true);
		tf.setLocationRelativeTo(null);
	}

	public boolean logarUsuario(String login, String senha) {
		boolean retorno;
		Fornecedor fornecedor = new Fornecedor();
		retorno = fornecedor.autenticarLogin(login, senha);
		return retorno;
	}
	
	public void cadastrar(Pessoa pessoa) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.cadastrarFornecedor(pessoa);
	}
}