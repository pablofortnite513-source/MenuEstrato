package vista;

import logica.Maestros;

public class Inicio {

	public static void main(String[] args) {
		Maestros.inicializar();
		Control control = new Control();
        control.iniciar();

	}

}
