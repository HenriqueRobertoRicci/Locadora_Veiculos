package Model;

public class Fornecedor extends Pessoa implements Autenticavel {

	@Override
	public boolean autenticarLogin(String login, String senha) {
		boolean retorno = false;
		FornecedorBD fbd = new FornecedorBD();
		Fornecedor fornecedor = fbd.buscaLogin(login, senha);
		if (fornecedor.getLogin() != null && fornecedor.getSenha() != null) {
			if (fornecedor.getLogin().equals(login) && fornecedor.getSenha().equals(senha)
					&& fornecedor.getTipo().equals("Fornecedor")) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	public void cadastrarFornecedor(Pessoa pessoa) {
		FornecedorBD fbd = new FornecedorBD();
		fbd.inserirFornecedor(pessoa);

	}

}
