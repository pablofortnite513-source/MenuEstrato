package vista;

import java.util.Scanner;
import beans.Bsexo;
import logica.Maestros;
import java.util.ArrayList;
public class VDatoSexo {
	
	private Scanner sc = new Scanner(System.in);
	private Menu menu = new Menu();
	
	public void mostrar() {
		
        int op;
        
        do {
            menu.menuSexo();
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Listar seleccionado.");
                    listar();
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 0);
	}
	
	public void listar() {	

	    ArrayList<Bsexo> lista = Maestros.listarSexos();

	    for (Bsexo s : lista) {
	        System.out.println(s.getCodeSexo() + " - " + s.getNombreSexo());
	    }
	}
	
}
