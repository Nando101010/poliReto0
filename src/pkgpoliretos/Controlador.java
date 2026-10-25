package pkgpoliretos;

import java.util.Scanner;

public class Controlador {
    private int n;
    private Serie serie;

    public Controlador(int n) {
        this.n = n;
        this.serie = new Serie();
    }

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========= MENU POLIRETOS (SERIES 1 AL 7) =========");
            System.out.println("1. SC01. Signos alternados (+, -, ...)");
            System.out.println("2. SC02. Grupos de signos (+, ++, ...)");
            System.out.println("3. SC03. Grupos de signos (++, +++, ...)");
            System.out.println("4. SC04. Operadores cíclicos (+, -, *, /)");
            System.out.println("5. SC05. Indicador direccional cíclico (\\, |, /, -)");
            System.out.println("6. SC06. Letras consecutivas (a, b, c...)");
            System.out.println("7. SC07. Letra y signo alternados (a, +, c, -...)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            System.out.println("\n--- Resultado de la Serie ---");
            switch (opcion) {
                case 1:
                    serie.g1Sc01SignosAlternados(n);
                    break;
                case 2:
                    serie.g1Sc02GruposSignosUno(n);
                    break;
                case 3:
                    serie.g1Sc03GruposSignosDos(n);
                    break;
                case 4:
                    serie.g1Sc04OperadoresCiclicos(n);
                    break;
                case 5:
                    serie.g1Sc05IndicadorDireccional(n);
                    break;
                case 6:
                    serie.g1Sc06LetrasConsecutivas(n);
                    break;
                case 7:
                    serie.g1Sc07LetraYSigno(n);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            if (opcion != 0) {
                System.out.println("------------------------------------------------");
            }
        } while (opcion != 0);

        scanner.close();
    }
}