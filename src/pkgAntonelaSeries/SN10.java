package pkgAntonelaSeries;

public class SN10 {

    /**
     * SN10. Potencias: 3, 9, 27, 81, 243, 729, ...
     * Imprime los primeros n términos de la serie, multiplicando cada término por 3 (máximo 39 para no desbordar long).
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN10(int n) {
        int limite = 39;
        long termino = 3;
        for (int i = 0; i < n && i < limite; i++) {
            System.out.print(termino + " ");
            termino = termino * 3;
        }
        System.out.println();
        if (n > limite) {
            System.out.println("Aviso: SN10 se limitó a " + limite + " términos.");
        }
    }
}