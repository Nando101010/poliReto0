import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de demostración de series ---");
            System.out.println("1. Probar SN01 (Fibonacci)");
            System.out.println("2. Probar SN02 (Impares con cero)");
            System.out.println("3. Probar SN03 (Fibonacci sobre impares)");
            System.out.println("4. Probar SN04 (Fibonacci sobre pares)");
            System.out.println("5. Probar SC15 (Bloques de asteriscos)");
            System.out.println("6. Probar SC16 (Alternancia letras)");
            System.out.println("7. Probar SC17 (Símbolos cíclicos)");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion != 0) {
                System.out.print("Ingresa el número de términos (n): ");
                int n = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        new ControllerSN01().ejecutarSN01(n);
                        break;
                    case 2:
                        new ControllerSN02().ejecutarSN02(n);
                        break;
                    case 3:
                        new ControllerSN03().ejecutarSN03(n);
                        break;
                    case 4:
                        new ControllerSN04().ejecutarSN04(n);
                        break;
                    case 5:
                        new ControllerSC15().ejecutarSC15(n);
                        break;
                    case 6:
                        new ControllerSC16().ejecutarSC16(n);
                        break;
                    case 7:
                        new ControllerSC17().ejecutarSC17(n);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            }
        } while (opcion != 0);

        System.out.println("¡Fin de la demostración!");
    }
}
        } while (opcion != 0);

        System.out.println("¡Fin de la demostración!");
    }
}
