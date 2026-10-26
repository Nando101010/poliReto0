package pkgAntonelaSeries;

public class ControllerSN12 {

    /**
     * SN12. Triangulares: 1, 3, 6, 10, 15, 21, ...
     * Crea la serie y muestra sus primeros n términos.
     *
     * @param n número de términos a mostrar
     */
    public void g1EjecutarSN12(int n) {
        SN12 serie = new SN12();
        System.out.print("SN12: ");
        serie.g1MostrarSN12(n);
    }
}