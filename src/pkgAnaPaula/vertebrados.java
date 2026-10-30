package pkgAnaPaula;

public class vertebrados extends fauna {
    protected String estructuraOsea;

    public vertebrados(String nombre, String clasificacion, int edad, String habitat, String tipoRespiracion, String sistemaLocomotor, String estructuraOsea) {
        super(nombre, clasificacion, edad, habitat, tipoRespiracion, sistemaLocomotor);
        this.estructuraOsea = estructuraOsea;
    }

    public void regularTemperatura() {
        System.out.println(nombre + " está regulando su temperatura corporal.");
    }

    @Override
    public void mostrarReino() {
        super.mostrarReino();
        System.out.println("/Vertebrados");
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
        System.out.println("Estructura ósea: " + estructuraOsea);
        moverse();
        regularTemperatura();
    }
}
