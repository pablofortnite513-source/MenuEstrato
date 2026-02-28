package vista;

public class Menu {

    public void menuPrincipal() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Maestras");
        System.out.println("2.Operaciones");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    public void menuMaestras() {
        System.out.println("\n--- MAESTRAS ---");
        System.out.println("1. Estrato");
        System.out.println("2. Sexo");
        System.out.println("3. Genero");
        System.out.println("4. Tipo de Sangre");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
    }

    public void menuSexo() {
        System.out.println("\n--- SEXO ---");
        System.out.println("1. Listar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
    }

    public void menuGenero() {
        System.out.println("\n--- GENERO ---");
        System.out.println("1. Listar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
    }

    public void menuTipoSangre() {
        System.out.println("\n--- TIPO DE SANGRE ---");
        System.out.println("1. Listar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
    }
    
    public void menuEstrato() {
    	System.out.println("\n--- ESTRATO --- ");
    	System.out.println("1. Listar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
    }
}