package pkgAntonelaSeries;

public class SN12 {

    /**
     * SN12. Triangulares: 1, 3, 6, 10, 15, 21, ...
     * Imprime los primeros n términos de la serie, sumando los naturales consecutivos.
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN12(int n) {
        int termino = 0;
        for (int i = 1; i <= n; i++) {
            termino = termino + i;
            System.out.print(termino + " ");
        }
        System.out.println();
    }
}