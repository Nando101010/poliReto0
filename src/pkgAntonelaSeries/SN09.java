package pkgAntonelaSeries;

public class SN09 {

    /**
     * SN09. Potencias: 2, 4, 8, 16, 32, 64, ...
     * Imprime los primeros n términos de la serie, multiplicando cada término por 2.
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN09(int n) {
        long termino = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(termino + " ");
            termino = termino * 2;
        }
        System.out.println();
    }
}