package pkgPoliretos2;

import java.util.Random;
import java.util.Scanner;

public class arrays {
    Scanner sc = new Scanner(System.in);

    // A01
    public void g1CargaNombres() {
        System.out.print("Ingrese las palabras de su nombre completo (ej: Carlos Daniel): ");
        sc.nextLine(); // Limpiar buffer
        String entrada = sc.nextLine();
        String[] palabras = entrada.split(" ");

        System.out.print("Ingrese los porcentajes de carga separados por espacio (ej: 100 75): ");
        String[] porcentajesStr = sc.nextLine().split(" ");

        for (int i = 0; i < palabras.length; i++) {
            int porcentaje = Integer.parseInt(porcentajesStr[i]);
            int barrasTotales = 15;
            int barrasLlenas = (porcentaje * barrasTotales) / 100;

            System.out.print(palabras[i] + "\n[");
            for (int b = 0; b < barrasTotales; b++) {
                if (b < barrasLlenas) System.out.print("=");
                else System.out.print(" ");
            }
            System.out.println("] " + porcentaje + "% " + palabras[i]);
        }
    }

    // A02
    public void g1MatrizIniciales() {
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        System.out.print("Ingrese el carácter para dibujar: ");
        char car = sc.next().charAt(0);

        char[][] matriz = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0) {
                    matriz[i][j] = car; // Dibuja la estructura base de las iniciales CC
                } else {
                    matriz[i][j] = ' ';
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // A03
    public void g1PlanoCoordenadas() {
        String nombre = "carlos";
        int filas = 6;
        for (int i = filas; i >= 0; i--) {
            System.out.print(i + " ");
            for (int x = 0; x <= i; x++) {
                if (2 * x == i) {
                    int charIndex = (x < nombre.length()) ? x % nombre.length() : 0;
                    System.out.print(nombre.charAt(charIndex) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // A04
    public void g1MatrizX() {
        String texto = "CARLOS";
        int n = texto.length();
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = texto.charAt(i); // Diagonal principal
                } else if (i + j == n - 1) {
                    matriz[i][j] = texto.charAt(i); // Diagonal secundaria
                } else {
                    matriz[i][j] = ' ';
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // A05
    public void g1MatrizAleatoria() {
        String nombre = "CARLOS";
        int n = nombre.length();
        char[][] matriz = new char[n][n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char letraAleatoria = nombre.charAt(rnd.nextInt(n));
                if (letraAleatoria == nombre.charAt(i)) {
                    matriz[i][j] = '*'; // Coincidencia de posición
                } else {
                    matriz[i][j] = letraAleatoria;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}