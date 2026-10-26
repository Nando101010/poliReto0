package pkgAntonelaSeries;

public class SN07 {

    /**
     * SN07. Progresión aritmética: 1, 4, 7, 10, 13, ...
     * Imprime los primeros n términos de la serie, sumando 3 a cada término.
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN07(int n) {
        int termino = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(termino + " ");
            termino = termino + 3;
        }
        System.out.println();
    }
}