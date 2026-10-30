package pkgAnaPaula;

public class flora extends reinoAnimal {
    protected String tipoHojas;

    public flora(String nombre, String clasificacion, int edad, String habitat, String tipoHojas) {
        super(nombre, clasificacion, edad, habitat);
        this.tipoHojas = tipoHojas;
    }

    public void hacerFotosintesis() {
        System.out.println(nombre + " está realizando la fotosíntesis.");
    }

    @Override
    public void mostrarReino() {
        super.mostrarReino();
        System.out.println("/Flora");
    }
    public void respirar() {
        System.out.println(nombre + " está respirando");
    }

}
