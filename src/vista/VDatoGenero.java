package vista;

import java.util.ArrayList;
import java.util.Scanner;

import beans.Bgenero;
import logica.Maestros;

public class VDatoGenero {

    private Scanner sc = new Scanner(System.in);
    private Menu menu = new Menu();

    public void mostrar() {

        int op;

        do {
            menu.menuGenero();
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Listar Género ");
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

        ArrayList<Bgenero> lista = Maestros.listarGeneros();

        for (Bgenero g : lista) {
            System.out.println(g.getCodigo() + " - " + g.getDescripcion());
        }
    }
}
