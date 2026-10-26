package pkgAntonelaSeries;

public class ControllerSN10 {

    /**
     * SN10. Potencias: 3, 9, 27, 81, 243, 729, ...
     * Crea la serie y muestra sus primeros n términos.
     *
     * @param n número de términos a mostrar
     */
    public void g1EjecutarSN10(int n) {
        SN10 serie = new SN10();
        System.out.print("SN10: ");
        serie.g1MostrarSN10(n);
    }
}