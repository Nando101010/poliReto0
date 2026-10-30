package pkgAnaPaula;

public class fauna extends reinoAnimal {
    protected String tipoRespiracion;
    protected String sistemaLocomotor;

    public fauna(String nombre, String clasificacion, int edad, String habitat, String tipoRespiracion, String sistemaLocomotor) {
        super(nombre, clasificacion, edad, habitat);
        this.tipoRespiracion = tipoRespiracion;
        this.sistemaLocomotor = sistemaLocomotor;
    }

    public void moverse() {
        System.out.println(nombre + " se está moviendo utilizando su sistema locomotor: " + sistemaLocomotor);
    }

    @Override
    public void mostrarReino() {
        super.mostrarReino();
        System.out.println("/Fauna");
    }
    public void respirar() {
        System.out.println(nombre + " está respirando");
    }

}
