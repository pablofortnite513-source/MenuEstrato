package vista;

import java.util.ArrayList;
import java.util.Scanner;

import beans.Estrato;
import logica.Maestros;

public class VDatoEstrato {

    private Scanner sc = new Scanner(System.in);
    private Menu menu = new Menu();

    public void mostrar() {

        int op;

        do {
            menu.menuEstrato();
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Listar Estrato.");
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

        ArrayList<Estrato> lista = Maestros.listarEstratos();

        for (Estrato e : lista) {
            System.out.println(e.getCodigo() + " - " + e.getDescripcion());
        }
    }
}
