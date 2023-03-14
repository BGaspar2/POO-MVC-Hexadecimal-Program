package mvc;

import controlador.controlador;
import modelo.NumeroDecimal;
import vista.Formulario;

public class mvc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumeroDecimal model = new NumeroDecimal();
		Formulario view = new Formulario();
		controlador con = new controlador(view, model);
		con.iniciar();
		view.setVisible(true);
	}

}
