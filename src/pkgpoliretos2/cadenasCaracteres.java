package pkgpoliretos2;

import java.util.Scanner;

public class cadenasCaracteres {

    static Scanner sc = new Scanner(System.in);
    static ControladorCadenas ctrl = new ControladorCadenas();

    static String pedir(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("\n===== CADENAS DE CARACTERES =====");
            System.out.println("1. C01 - Contar vocales");
            System.out.println("2. C02 - Contar letras");
            System.out.println("3. C03 - Eliminar una vocal");
            System.out.println("4. C04 - Eliminar una letra");
            System.out.println("5. C05 - Invertida con vocales en mayusculas");
            System.out.println("6. C06 - Invertida con letras en mayusculas");
            System.out.println("7. C07 - Mayusculas y sin la J");
            System.out.println("8. C08 - Anagramas");
            System.out.println("9. C09 - Mayuscula y minuscula alternadas");
            System.out.println("0. Salir");
            try {
                op = Integer.parseInt(pedir("Opcion: ").trim());
            } catch (NumberFormatException e) {
                op = -1;
            }

            switch (op) {
                case 1: {
                    String f = pedir("frase: ");
                    System.out.println("salida: tiene " + ctrl.contarVocales(f) + " vocales");
                    break;
                }
                case 2: {
                    String f = pedir("frase: ");
                    System.out.println("salida: tiene " + ctrl.contarLetras(f) + " letras");
                    break;
                }
                case 3: {
                    String f = pedir("frase: ");
                    String v = pedir("vocal: ");
                    if (v.length() == 1 && "aeiouAEIOU".indexOf(v.charAt(0)) >= 0)
                        System.out.println("salida: " + ctrl.eliminarVocal(f, v.charAt(0)));
                    else
                        System.out.println("Debe ingresar una sola vocal.");
                    break;
                }
                case 4: {
                    String f = pedir("frase: ");
                    String l = pedir("letra: ");
                    if (l.length() == 1 && Character.isLetter(l.charAt(0)))
                        System.out.println("salida: " + ctrl.eliminarLetra(f, l.charAt(0)));
                    else
                        System.out.println("Debe ingresar una sola letra.");
                    break;
                }
                case 5: {
                    String f = pedir("frase: ");
                    System.out.println("salida: " + ctrl.invertirVocalesMayusculas(f));
                    break;
                }
                case 6: {
                    String f = pedir("frase: ");
                    System.out.println("salida: " + ctrl.invertirLetrasMayusculas(f));
                    break;
                }
                case 7: {
                    String f = pedir("frase: ");
                    System.out.println("salida: " + ctrl.mayusculasSinJ(f));
                    break;
                }
                case 8: {
                    String palabra = ctrl.palabraAleatoria();
                    System.out.println("Palabra: " + palabra);
                    String intento = pedir("Ingrese un anagrama de la palabra: ").trim();
                    if (ctrl.esAnagrama(palabra, intento))
                        System.out.println("¡Correcto! '" + intento + "' es un anagrama de '" + palabra + "'");
                    else
                        System.out.println("Incorrecto, '" + intento + "' no es un anagrama de '" + palabra + "'");
                    break;
                }
                case 9: {
                    String f = pedir("frase: ");
                    System.out.println("salida: " + ctrl.alternarMayusMinus(f));
                    break;
                }
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (op != 0);
    }
}