import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("grupo-01");
        System.out.println("integrantes:");
        System.out.println("Andrango Fernando");
        System.out.println("Brito Maria");
        System.out.println("Calahorrano Ana");
        System.out.println("Cuji Erick");
        System.out.println("Caviedes Carlos");

        System.out.print("Ingrese el número de términos (n) a generar: ");
        int n = scanner.nextInt();

        int opcionProyecto;
        do {
            System.out.println("\n========= SELECCIONE EL PAQUETE =========");
            System.out.println("1. Paquete 1: pkgpoliretos (Series, Figuras, Cadenas, etc.)");
            System.out.println("2. Paquete 2: pkgPoliretos2 (Series, Figuras, Cadenas, etc.)");
            System.out.println("3. Salir del programa");
            System.out.print("Opción: ");
            
            opcionProyecto = scanner.nextInt();

            switch (opcionProyecto) {
                case 1:
                    System.out.println("\n--- Abriendo pkgPolirestos ---");
                    pkgpoliretos.Controlador control1 = new pkgpoliretos.Controlador(n);
                    control1.iniciarMenu();
                    break;
                case 2:
                    System.out.println("\n--- Abriendo pkgPoliretos2 ---");
                    pkgPoliretos2.Controlador2 control2 = new pkgPoliretos2.Controlador2(n);
                    control2.iniciarMenu();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionProyecto != 3);

        scanner.close();
    }
}
