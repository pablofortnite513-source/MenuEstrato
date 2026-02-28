package vista;

import java.util.Scanner;

public class VDatoMaestra {

    private Scanner sc = new Scanner(System.in);
    private Menu menu = new Menu();

    public void mostrar() {

        int opc;

        do {
            menu.menuMaestras();
            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    new VDatoEstrato().mostrar();
                    break;

                case 2:
                    new VDatoSexo().mostrar();
                    break;

                case 3:
                    new VDatoGenero().mostrar();
                    break;

                case 4:
                    new VDatoTipoSangre().mostrar();
                    break;

                case 0:
                    System.out.println("Volviendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opc != 0);
    }
}