package pkgAntonelaSeries;

public class ControllerSN13 {

    /**
     * SN13. Factoriales: 1, 2, 6, 24, 120, 720, ...
     * Crea la serie y muestra sus primeros n términos.
     *
     * @param n número de términos a mostrar
     */
    public void g1EjecutarSN13(int n) {
        SN13 serie = new SN13();
        System.out.print("SN13: ");
        serie.g1MostrarSN13(n);
    }
}