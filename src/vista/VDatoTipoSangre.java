package vista;

import java.util.ArrayList;
import java.util.Scanner;

import beans.TipoSangre;
import logica.Maestros;

public class VDatoTipoSangre {

    private Scanner sc = new Scanner(System.in);
    private Menu menu = new Menu();

    public void mostrar() {

        int op;

        do {
            menu.menuTipoSangre();
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Listar Tipo Sangre.");
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

        ArrayList<TipoSangre> lista = Maestros.listarTipoSangre();

        for (TipoSangre t : lista) {
            System.out.println(t.getCodigo() + " - " + t.getDescripcion());
        }
    }
}
