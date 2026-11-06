package pkgPoliretos2;

import java.util.Scanner;

public class Controlador2 {
private int n;

    public Controlador2(int n) {
        this.n = n;
    }

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========= MENÚ PRINCIPAL - POLIRETOS 2 =========");
            System.out.println("1. Figuras");
            System.out.println("2. Cadenas de Caracteres");
            System.out.println("3. Arrays y Matrices");
            System.out.println("4. Animaciones de Carga (Loading)");
            System.out.println("5. Recursión");
            System.out.println("6. Grafos y Autómatas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción de bloque: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Cargando Bloque: Figuras (n = " + n + ") ---");
                    figuras objFiguras = new figuras();
                    objFiguras.imprimirTodas(n);
                    break;
                case 2:
                    System.out.println("\n--- Cargando Bloque: Cadenas de Caracteres (n = " + n + ") ---");
                    ControladorCadenas objCadenas = new ControladorCadenas();
                    objCadenas.ejecutarEjercicios("Hola, ¿cómo estás?");
                    break;
                case 3:
                    System.out.println("\n--- Cargando Bloque: Arrays y Matrices (n = " + n + ") ---");
                    break;
                case 4:
                    System.out.println("\n--- Cargando Bloque: Animaciones de Carga / Loading (n = " + n + ") ---");
                    break;
                case 5:
                    System.out.println("\n--- Cargando Bloque: Recursión (n = " + n + ") ---");
                    g1MostrarRecursion(scanner);
                    break;
                case 6:
                    System.out.println("\n--- Cargando Bloque: Grafos y Autómatas (n = " + n + ") ---");
                    g1MostrarAutomatas(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema. ¡Buen trabajo en equipo, grupo g1!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 7);
        
        scanner.close();
    }

    
    /**
     * Bloque Recursión: pide a y b y ejecuta los ejercicios R01 a R06.
     *
     * @param scanner lector de la entrada de consola
     */
    public void g1MostrarRecursion(Scanner scanner) {
        int a = g1LeerNumero(scanner, "Número a: ");
        int b = g1LeerNumero(scanner, "Número b: ");

        recursion ejercicios = new recursion();

        System.out.println("R01 factorial: " + ejercicios.g1R01Factorial(n));
        System.out.println("R02 suma: " + ejercicios.g1R02Suma(a, b));
        System.out.println("R03 multiplicación: " + ejercicios.g1R03Multiplicacion(a, b));
        System.out.println("R04 potencia: " + ejercicios.g1R04Potencia(a, b));
        System.out.println("R05 conteo progresivo:");
        ejercicios.g1R05ConteoProgresivoHasta(n);
        System.out.println();
        System.out.println("R06 conteo regresivo:");
        ejercicios.g1R06ConteoRegresivo(n);
        System.out.println();
    }

    /**
     * Pide un número entero mayor que 0 hasta que el dato sea válido.
     *
     * @param scanner lector de la entrada de consola
     * @param texto mensaje que se muestra al pedir el número
     * @return número entero mayor que 0
     */
    public int g1LeerNumero(Scanner scanner, String texto) {
        int numero = 0;
        while (numero <= 0) {
            System.out.print(texto);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
            } else {
                scanner.next();
            }
            if (numero <= 0) {
                System.out.println("Error: ingresa un número entero mayor que 0.");
            }
        }
        return numero;
    }
    
    /**
     * Bloque Grafos y Autómatas: pide una cadena y la valida con los autómatas A01 a A04.
     *
     * @param scanner lector de la entrada de consola
     */
    public void g1MostrarAutomatas(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Cadena a validar: ");
        String cadena = scanner.nextLine();

        grafosYAutomatas automatas = new grafosYAutomatas();

        System.out.println("A01 a*b+c: " + g1TextoResultado(automatas.g1A01Automata(cadena)));
        System.out.println("A02 ab+ca: " + g1TextoResultado(automatas.g1A02Automata(cadena)));
        System.out.println("A03 a+/b+/c+: " + g1TextoResultado(automatas.g1A03Automata(cadena)));
        System.out.println("A03 1+/0+1*: " + g1TextoResultado(automatas.g1A03bAutomata(cadena)));
        System.out.println("A04 número decimal: " + g1TextoResultado(automatas.g1A04CompiladorDecimal(cadena)));
    }

    /**
     * Convierte el resultado de un autómata en texto.
     *
     * @param valida resultado del autómata
     * @return "válida" si la cadena fue aceptada, "inválida" si no
     */
    public String g1TextoResultado(boolean valida) {
        if (valida) {
            return "válida";
        }
        return "inválida";
    }
}
