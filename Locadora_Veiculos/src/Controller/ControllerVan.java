package Controller;

import Model.Van;

public class ControllerVan {
	public void cadastrar(Van novaVan) {
		Van van = new Van();
		van.cadastrarVan(novaVan);
	}
}
