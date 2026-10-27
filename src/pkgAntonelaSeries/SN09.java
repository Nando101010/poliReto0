package pkgAntonelaSeries;

public class SN09 {

    /**
     * SN09. Potencias: 2, 4, 8, 16, 32, 64, ...
     * Imprime los primeros n términos de la serie, multiplicando cada término por 2 (máximo 62 para no desbordar long).
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN09(int n) {
        int limite = 62;
        long termino = 2;
        for (int i = 0; i < n && i < limite; i++) {
            System.out.print(termino + " ");
            termino = termino * 2;
        }
        System.out.println();
        if (n > limite) {
            System.out.println("Aviso: SN09 se limitó a " + limite + " términos.");
        }
    }
}