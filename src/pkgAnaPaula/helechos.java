package pkgAnaPaula;

public class helechos extends flora {
    protected int numeroFrondas;

    public helechos(String nombre, String clasificacion, int edad, String habitat, String tipoHojas, int numeroFrondas) {
        super(nombre, clasificacion, edad, habitat, tipoHojas);
        this.numeroFrondas = numeroFrondas;
    }

    public void liberarEsporas() {
        System.out.println(nombre + " está liberando esporas.");
    }

    @Override
    public void mostrarReino() {
        super.mostrarReino();
        System.out.println("/Helechos");
    }

    @Override
    public void mostrarInformacion(){
        mostrarReino();
        System.out.println("Nombre: " + nombre);
        System.out.println("Propiedades: Hojas tipo " + tipoHojas + ", Número de frondas: " + numeroFrondas);
        hacerFotosintesis();
    }

}
