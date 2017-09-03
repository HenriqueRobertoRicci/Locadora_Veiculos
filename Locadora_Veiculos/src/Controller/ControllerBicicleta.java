package Controller;

import Model.Bicicleta;

public class ControllerBicicleta {
	public void cadastrar(Bicicleta novaBicicleta) {
		Bicicleta b = new Bicicleta();
		b.cadastrarBicicleta(novaBicicleta);
	}

}

