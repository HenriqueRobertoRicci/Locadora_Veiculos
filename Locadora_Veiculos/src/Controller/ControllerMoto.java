package Controller;

import Model.Moto;

public class ControllerMoto {
	public void cadastrar(Moto novaMoto) {
		Moto m = new Moto();
		m.cadastrarMoto(novaMoto);
	}

}
