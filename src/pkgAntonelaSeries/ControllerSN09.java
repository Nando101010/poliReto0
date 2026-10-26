package pkgAntonelaSeries;

public class ControllerSN09 {

    /**
     * SN09. Potencias: 2, 4, 8, 16, 32, 64, ...
     * Crea la serie y muestra sus primeros n términos.
     *
     * @param n número de términos a mostrar
     */
    public void g1EjecutarSN09(int n) {
        SN09 serie = new SN09();
        System.out.print("SN09: ");
        serie.g1MostrarSN09(n);
    }
}