package pkgAntonelaSeries;

public class SN12 {

    /**
     * SN12. Triangulares: 1, 3, 6, 10, 15, 21, ...
     * Imprime los primeros n términos de la serie, sumando los naturales consecutivos
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN12(int n) {
        int limite = 65535;
        int termino = 0;
        for (int i = 1; i <= n && i <= limite; i++) {
            termino = termino + i;
            System.out.print(termino + " ");
        }
        System.out.println();
        if (n > limite) {
            System.out.println("Aviso: SN12 se limitó a " + limite + " términos.");
        }
    }
}