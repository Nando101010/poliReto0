package pkgAntonelaSeries;

public class SN11 {

    /**
     * SN11. Números oblongos: 2, 6, 12, 20, 30, 42, ...
     * Imprime los primeros n términos de la serie, donde el término i es i(i+1)
     *
     * @param n número de términos a mostrar
     */
    public void g1MostrarSN11(int n) {
        int limite = 46340;
        for (int i = 1; i <= n && i <= limite; i++) {
            int termino = i * (i + 1);
            System.out.print(termino + " ");
        }
        System.out.println();
        if (n > limite) {
            System.out.println("Aviso: SN11 se limitó a " + limite + " términos.");
        }
    }
}