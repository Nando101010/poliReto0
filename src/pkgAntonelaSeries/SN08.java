package pkgAntonelaSeries;

public class SN08 {

    /**
     * SN08. Progresión aritmética: 3, 8, 13, 18, 23, ...
     * Imprime los primeros n términos de la serie, sumando 5 a cada término.
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN08(int n) {
        int termino = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(termino + " ");
            termino = termino + 5;
        }
        System.out.println();
    }
}