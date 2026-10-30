package pkgAnaPaula;

public class Controlador {
public static void main(String[] args) {
        System.out.println("==== REINO ANIMAL ====");

        helechos mihelechito = new helechos("Helechito", "Flora", 2, "Bosque", "Frondas", 12);
        mihelechito.mostrarInformacion();

        System.out.println("----------------------------------------------------");

        vertebrados mivertebrado = new vertebrados("Tigre Igor", "Fauna", 5, "Selva", "Respiración pulmonar", "Locomoción terrestre", "Columna vertebral");
        mivertebrado.mostrarInformacion();

        System.out.println("----------------------------------------------------");

        invertebrados miinvertebrado = new invertebrados("Mariposa Monarca", "Fauna", 1, "Jardín", "Respiración traqueal", "Locomoción aérea", "Exoesqueleto");
        miinvertebrado.mostrarInformacion();
    }

}
