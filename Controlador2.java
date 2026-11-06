package pkgPoliretos2;

import java.util.Scanner;


public class Controlador2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("grupo-01");
        System.out.println("cuji.erick");
        System.out.println("=========================================");

        loading objLoading = new loading();
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL POLIRETOS ---");
            System.out.println("1. Entrar al Menú de Cargas y Animaciones");
            System.out.println("0. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    objLoading.menuIndividual();
                    break;
                case 0:
                    System.out.println("¡Programa finalizado con éxito!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}