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
            System.out.println("8. SC08. Letras repetidas (aa, bbbb, cccccc, dddddddd...)");
            System.out.println("9. SC09. Letras repetidas (a, bbb, ccccc, ddddddd...)");
            System.out.println("10. SC10. Letras con repetición (a, bb, ccc, dddd...)");
            System.out.println("11. SC11. Grupos de numeral (#, ##, ###...)");
            System.out.println("12. SC12. Vocales repetidas (a, eee, iiiii, ooooooo...)");
            System.out.println("13. SC13. Letra repetida creciente (A, BB, CCC, DDDD...)");
            System.out.println("14. SC14. Alfabeto (A, B, C, D...)");
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
                case 8: 
                     serie.g1Sc08letrasRepetidasPar(n);
                    break;
                case 9: 
                     serie.g1Sc09letrasRepetidasImpar(n);
                    break;
                case 10:
                    serie.g1Sc10letrasConRepeticion(n);
                    break;
                case 11:
                    serie.g1Sc11gruposDeNumeral(n);
                    break;
                case 12:
                    serie.g1Sc12vocalesRepetidas(n);
                    break;
                case 13:
                    serie.g1Sc13letraRepetidaCreciente(n);
                    break;
                case 14:
                    serie.g1Sc14alfabeto(n);
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