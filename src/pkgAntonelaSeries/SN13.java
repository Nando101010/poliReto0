package pkgAntonelaSeries;

public class SN13 {

    /**
     * SN13. Factoriales: 1, 2, 6, 24, 120, 720, ...
     * Imprime los primeros n términos de la serie, multiplicando por el índice i (máximo 20 para no desbordar long).
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN13(int n) {
        int limite = 20;
        long termino = 1;
        for (int i = 1; i <= n && i <= limite; i++) {
            termino = termino * i;
            System.out.print(termino + " ");
        }
        System.out.println();
        if (n > limite) {
            System.out.println("Aviso: SN13 se limitó a " + limite + " términos.");
        }
    }
}