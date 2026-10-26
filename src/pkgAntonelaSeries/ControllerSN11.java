package pkgAntonelaSeries;

public class ControllerSN11 {

    /**
     * SN11. Números oblongos: 2, 6, 12, 20, 30, 42, ...
     * Crea la serie y muestra sus primeros n términos.
     *
     * @param n número de términos a mostrar
     */
    public void g1EjecutarSN11(int n) {
        SN11 serie = new SN11();
        System.out.print("SN11: ");
        serie.g1MostrarSN11(n);
    }
}