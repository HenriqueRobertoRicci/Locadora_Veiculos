package Model;

import java.util.Date;

public class Usuario extends Pessoa implements Autenticavel {

	public Usuario() {

	}

	/*public Usuario(String nome, String cpf, String sexo, Date datanasc, String email, String telefone, String cep,
			String rua, String numero, String bairro, String cidade, String estado, String categoriacnh,
			String numerocnh, String login, String senha) {
	
	}*/

	@Override
	public boolean autenticarLogin(String login, String senha) {
		boolean retorno = false;
		UsuarioBD ubd = new UsuarioBD();
		Usuario usuario = ubd.buscaLogin(login, senha);
		if (usuario.getLogin() != null && usuario.getSenha() != null) {
			if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)
					&& usuario.getTipo().equals("Usuário")) {
				retorno = true;
			}
		}
		return retorno;
	}

	public void cadastrarUsuario(Pessoa pessoa) {
		UsuarioBD ubd = new UsuarioBD();
		ubd.inserirUsuario(pessoa);

	}

}
