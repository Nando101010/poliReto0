package pkgAnaPaula;

public class plantasConFlor extends flora {
    protected String colorPetalos;

    public plantasConFlor(String nombre, String clasificacion, int edad, String habitat, String tipoHojas, String colorPetalos) {
        super(nombre, clasificacion, edad, habitat, tipoHojas);
        this.colorPetalos = colorPetalos;
    }

    public void polinizar() {
        System.out.println(nombre + " está siendo polinizada.");
    }

    @Override
    public void mostrarReino() {
        super.mostrarReino();
        System.out.println("/Plantas con Flor");
    }

    @Override
    public void mostrarInformacion(){
        mostrarReino();
        System.out.println("Nombre: " + nombre);
        System.out.println("Propiedades: Hojas tipo " + tipoHojas + ", Color de pétalos: " + colorPetalos);
        hacerFotosintesis();
    }

}
