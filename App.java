import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar número de términos: ");
        int n = scanner.nextInt();

        ControllerSN01 controlador = new ControllerSN01();
        controlador.ejecutarSN01(n);
    }
}