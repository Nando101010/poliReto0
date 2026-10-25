
import java.util.Scanner;
import pkgpoliretos.Controlador;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("grupo-01");
        System.out.println("integrantes:");
        System.out.println("Andrango Fernando");
        System.out.println("Brito Maria");
        System.out.println("Calahorrano Ana");
        System.out.println("Cuji Erick");
        System.out.println("Caviedes Carlos");

        System.out.print("Ingrese el número de términos (n) a generar: ");
        int n = scanner.nextInt();

        Controlador controlador = new Controlador(n);
        controlador.iniciarMenu();

        scanner.close();
    }
}