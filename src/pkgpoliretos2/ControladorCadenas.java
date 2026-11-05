package pkgpoliretos2;

import java.util.Arrays;
import java.util.Random;

public class ControladorCadenas {

    private final String[] palabras = { "roma", "amor", "sal", "luz", "cena", "ratón", "mesa", "pelo" };
    private final Random random = new Random();

    private boolean esVocal(char c) {
        return "aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(c) >= 0;
    }

    private String invertir(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // C01
    public int contarVocales(String frase) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (esVocal(frase.charAt(i)))
                cont++;
        }
        return cont;
    }

    // C02
    public int contarLetras(String frase) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i)))
                cont++;
        }
        return cont;
    }

    // C03
    public String eliminarVocal(String frase, char vocal) {
        return reemplazarPorEspacio(frase, vocal);
    }

    // C04
    public String eliminarLetra(String frase, char letra) {
        return reemplazarPorEspacio(frase, letra);
    }

    private String reemplazarPorEspacio(String frase, char objetivo) {
        char o = Character.toLowerCase(objetivo);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            sb.append(Character.toLowerCase(c) == o ? ' ' : c);
        }
        return sb.toString();
    }

    // C05
    public String invertirVocalesMayusculas(String frase) {
        String inv = invertir(frase);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inv.length(); i++) {
            char c = inv.charAt(i);
            sb.append(esVocal(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        return sb.toString();
    }

    // C06
    public String invertirLetrasMayusculas(String frase) {
        String inv = invertir(frase);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inv.length(); i++) {
            char c = inv.charAt(i);
            if (Character.isLetter(c) && !esVocal(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    // C07
    public String mayusculasSinJ(String frase) {
        String may = frase.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < may.length(); i++) {
            char c = may.charAt(i);
            if (c != 'J')
                sb.append(c);
        }
        return sb.toString();
    }

    // C08
    public String palabraAleatoria() {
        return palabras[random.nextInt(palabras.length)];
    }

    public boolean esAnagrama(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.equals(b) || a.length() != b.length())
            return false;
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    // C09
    public String alternarMayusMinus(String frase) {
        StringBuilder sb = new StringBuilder();
        boolean mayuscula = true;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(mayuscula ? Character.toUpperCase(c) : Character.toLowerCase(c));
                mayuscula = !mayuscula;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}