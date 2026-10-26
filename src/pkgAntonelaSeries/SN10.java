package pkgAntonelaSeries;

public class SN10 {

    /**
     * SN10. Potencias: 3, 9, 27, 81, 243, 729, ...
     * Imprime los primeros n términos de la serie, multiplicando cada término por 3.
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN10(int n) {
        long termino = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(termino + " ");
            termino = termino * 3;
        }
        System.out.println();
    }
}