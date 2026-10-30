package pkgAnaPaula;

public class musgos extends flora {
    protected String grosorAlfombra;

    public musgos(String nombre, String clasificacion, int edad, String habitat, String tipoHojas, String grosorAlfombra) {
        super(nombre, clasificacion, edad, habitat, tipoHojas);
        this.grosorAlfombra = grosorAlfombra;
    }

    public void retenerAgua() {
        System.out.println(nombre + " está reteniendo agua en su alfombra de musgo.");
    }

    @Override
    public void mostrarReino() {
        super.mostrarReino();
        System.out.println("/Musgos");
    }

    @Override
    public void mostrarInformacion(){
        mostrarReino();
        System.out.println("Nombre: " + nombre);
        System.out.println("Propiedades: Hojas tipo " + tipoHojas + ", Grosor de la alfombra: " + grosorAlfombra);
        hacerFotosintesis();
    }

}
