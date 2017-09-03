package Controller;

import java.util.Date;

import Model.Pessoa;
import Model.Usuario;
import View.TelaUsuario;

public class ControllerUsuario {
	public void mostrarTelaUsuario() {
		TelaUsuario tu = new TelaUsuario();
		tu.setVisible(true);
		tu.setLocationRelativeTo(null);
	}

	public boolean logarUsuario(String login, String senha) {
		boolean retorno;
		Usuario usuario = new Usuario();
		retorno = usuario.autenticarLogin(login, senha);
		return retorno;
	}

	public void cadastrar(Pessoa pessoa) {
		Usuario usuario = new Usuario();
		usuario.cadastrarUsuario(pessoa);
	}
	
	public int calcularIdade(int data) {
		return 2017 - data;
	}
}
