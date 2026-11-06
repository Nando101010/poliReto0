package pkgPoliretos2;

import java.math.BigInteger;

public class recursion {

    /**
     * R01. Factorial: 5! = 120
     * Calcula el factorial de n multiplicando n por el factorial de n-1 (máximo 20 para no desbordar long).
     *
     * @param n número del que se calcula el factorial
     * @return factorial de n
     */
    public long g1R01Factorial(int n) {
        int limite = 20;
        if (n > limite) {
            System.out.println("Aviso: R01 limitó n a " + limite + " para no desbordar el tipo long.");
            n = limite;
        }
        if (n <= 1) {
            return 1;
        }
        return n * g1R01Factorial(n - 1);
    }

    /**
     * R02. Suma: suma(3, 4) = 7
     * Calcula a + b sumando 1 a la suma de a y b-1 hasta que b llegue a 0 (máximo b = 1000 para no desbordar la pila de llamadas).
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return suma de a y b
     */
    public long g1R02Suma(int a, int b) {
        int limite = 1000;
        if (b > limite) {
            System.out.println("Aviso: R02 limitó b a " + limite + " para no desbordar la pila de llamadas.");
            b = limite;
        }
        if (b == 0) {
            return a;
        }
        return 1 + g1R02Suma(a, b - 1);
    }

    /**
     * R03. Multiplicación: multiplicacion(3, 4) = 12
     * Calcula a * b sumando a con la multiplicación de a y b-1 hasta que b llegue a 0 (máximo b = 1000 para no desbordar la pila de llamadas).
     *
     * @param a número que se repite en la suma
     * @param b cantidad de veces que se suma a
     * @return producto de a y b
     */
    public long g1R03Multiplicacion(int a, int b) {
        int limite = 1000;
        if (b > limite) {
            System.out.println("Aviso: R03 limitó b a " + limite + " para no desbordar la pila de llamadas.");
            b = limite;
        }
        if (b == 0) {
            return 0;
        }
        return a + g1R03Multiplicacion(a, b - 1);
    }

    /**
     * R04. Potencia: potencia(3, 4) = 81
     * Calcula a elevado a b multiplicando a por la potencia de a y b-1 hasta que b llegue a 0 (máximo b = 1000 para no desbordar la pila de llamadas).
     *
     * @param a base
     * @param b exponente
     * @return a elevado a b
     */
    public BigInteger g1R04Potencia(int a, int b) {
        int limite = 1000;
        if (b > limite) {
            System.out.println("Aviso: R04 limitó b a " + limite + " para no desbordar la pila de llamadas.");
            b = limite;
        }
        if (b == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(a).multiply(g1R04Potencia(a, b - 1));
    }

    /**
     * R05. Conteo progresivo hasta n: 1, 2, 3, ..., n
     * Imprime el avance del conteo llamando primero a n-1 y luego mostrando n (máximo 1000 para no desbordar la pila de llamadas).
     *
     * @param n número hasta el que se cuenta
     */
    public void g1R05ConteoProgresivoHasta(int n) {
        int limite = 1000;
        if (n > limite) {
            System.out.println("Aviso: R05 limitó n a " + limite + " para no desbordar la pila de llamadas.");
            n = limite;
        }
        if (n > 0) {
            g1R05ConteoProgresivoHasta(n - 1);
            System.out.print(n + " ");
        }
    }

    /**
     * R06. Conteo regresivo desde n hasta 0: n, ..., 2, 1, 0
     * Imprime el avance del conteo mostrando n y luego llamando a n-1 hasta llegar a 0 (máximo 1000 para no desbordar la pila de llamadas).
     *
     * @param n número desde el que se cuenta
     */
    public void g1R06ConteoRegresivo(int n) {
        int limite = 1000;
        if (n > limite) {
            System.out.println("Aviso: R06 limitó n a " + limite + " para no desbordar la pila de llamadas.");
            n = limite;
        }
        System.out.print(n + " ");
        if (n > 0) {
            g1R06ConteoRegresivo(n - 1);
        }
    }
}