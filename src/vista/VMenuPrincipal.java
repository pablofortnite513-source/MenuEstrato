package vista;

import java.util.Scanner;

public class VMenuPrincipal {

    private Scanner sc = new Scanner(System.in);
    private Menu menu = new Menu();

    public void mostrar() {

        int opcion;

        do {
            menu.menuPrincipal();
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    new VDatoMaestra().mostrar();
                    break;

                case 2:
                    System.out.println("Acá va el menú de operaciones");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }
}
