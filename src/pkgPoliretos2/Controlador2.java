package pkgPoliretos2;

import java.util.Scanner;

public class Controlador2 {
private int n;

    public Controlador2(int n) {
        this.n = n;
    }

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========= MENÚ PRINCIPAL - POLIRETOS 2 =========");
            System.out.println("1. Series Numéricas");
            System.out.println("2. Series de Caracteres");
            System.out.println("3. Figuras");
            System.out.println("4. Cadenas de Caracteres");
            System.out.println("5. Arrays y Matrices");
            System.out.println("6. Animaciones de Carga (Loading)");
            System.out.println("7. Recursión");
            System.out.println("8. Grafos y Autómatas");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción de bloque: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Cargando Bloque: Series Numéricas (n = " + n + ") ---");
                    break;
                case 2:
                    System.out.println("\n--- Cargando Bloque: Series de Caracteres (n = " + n + ") ---");
                    break;
                case 3:
                    System.out.println("\n--- Cargando Bloque: Figuras (n = " + n + ") ---");
                    figuras objFiguras = new figuras();
                    objFiguras.imprimirTodas(n);
                    break;
                case 4:
                    System.out.println("\n--- Cargando Bloque: Cadenas de Caracteres (n = " + n + ") ---");
                    break;
                case 5:
                    System.out.println("\n--- Cargando Bloque: Arrays y Matrices (n = " + n + ") ---");
                    break;
                case 6:
                    System.out.println("\n--- Cargando Bloque: Animaciones de Carga / Loading (n = " + n + ") ---");
                    break;
                case 7:
                    System.out.println("\n--- Cargando Bloque: Recursión (n = " + n + ") ---");
                    break;
                case 8:
                    System.out.println("\n--- Cargando Bloque: Grafos y Autómatas (n = " + n + ") ---");
                    break;
                case 9:
                    System.out.println("Saliendo del sistema. ¡Buen trabajo en equipo, grupo g1!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 9);
        
        scanner.close();
    }
}
