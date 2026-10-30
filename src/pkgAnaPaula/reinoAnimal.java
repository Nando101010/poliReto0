package pkgAnaPaula;

public class reinoAnimal {
    protected String nombre;
    protected String clasificacion;
    protected int edad;
    protected String habitat;

    public reinoAnimal(String nombre, String clasificacion, int edad, String habitat) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.edad = edad;
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void mostrarReino() {
        System.out.println("Reino Animal");
    } 
    
    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }

     public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("Edad: " + edad);
        System.out.println("Hábitat: " + habitat);
        respirar();
    }

}
