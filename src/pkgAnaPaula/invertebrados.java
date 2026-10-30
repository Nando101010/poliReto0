package pkgAnaPaula;

public class invertebrados extends fauna {
    protected String tipoExoesqueleto;

    public invertebrados(String nombre, String clasificacion, int edad, String habitat, String tipoRespiracion, String sistemaLocomotor, String tipoExoesqueleto) {
        super(nombre, clasificacion, edad, habitat, tipoRespiracion, sistemaLocomotor);
        this.tipoExoesqueleto = tipoExoesqueleto;
    }

    public void desarrollarMetamorfosis() {
        System.out.println(nombre + " está desarrollando metamorfosis.");
    }

    @Override
    public void mostrarReino() {
        super.mostrarReino();
        System.out.println("/Invertebrados");
    }

    @Override
    public void mostrarInformacion() {
        mostrarReino();
        System.out.println("Nombre: " + nombre);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("Edad: " + edad);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Tipo de respiración: " + tipoRespiracion);
        System.out.println("Sistema locomotor: " + sistemaLocomotor);
        System.out.println("Tipo de exoesqueleto: " + tipoExoesqueleto);
        moverse();
        desarrollarMetamorfosis();
    }

}
