package pkgPoliretos2;

public class grafosYAutomatas {

    /**
     * A01. Autómata para validar: a*b+c (válidas: bc, aabbc)
     * Recorre la cadena con estados y acepta si termina en el estado final q2.
     *
     * @param cadena texto a validar
     * @return true si la cadena cumple el patrón, false si no
     */
    public boolean g1A01Automata(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length() && estado != -1; i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'a') {
                        estado = 0;
                    } else if (c == 'b') {
                        estado = 1;
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        estado = 1;
                    } else if (c == 'c') {
                        estado = 2;
                    } else {
                        estado = -1;
                    }
                    break;
                default:
                    estado = -1;
            }
        }
        return estado == 2;
    }

    /**
     * A02. Autómata para validar: ab+ca (válidas: abca, abbbca)
     * Recorre la cadena con estados y acepta si termina en el estado final q4.
     *
     * @param cadena texto a validar
     * @return true si la cadena cumple el patrón, false si no
     */
    public boolean g1A02Automata(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length() && estado != -1; i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'a') {
                        estado = 1;
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        estado = 2;
                    } else {
                        estado = -1;
                    }
                    break;
                case 2:
                    if (c == 'b') {
                        estado = 2;
                    } else if (c == 'c') {
                        estado = 3;
                    } else {
                        estado = -1;
                    }
                    break;
                case 3:
                    if (c == 'a') {
                        estado = 4;
                    } else {
                        estado = -1;
                    }
                    break;
                default:
                    estado = -1;
            }
        }
        return estado == 4;
    }

    /**
     * A03. Autómata para validar: a+/b+/c+ (válidas: aaa, bb, c)
     * Recorre la cadena con estados y acepta si termina en q1, q2 o q3 (solo a's, solo b's o solo c's).
     *
     * @param cadena texto a validar
     * @return true si la cadena cumple el patrón, false si no
     */
    public boolean g1A03Automata(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length() && estado != -1; i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'a') {
                        estado = 1;
                    } else if (c == 'b') {
                        estado = 2;
                    } else if (c == 'c') {
                        estado = 3;
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (c != 'a') {
                        estado = -1;
                    }
                    break;
                case 2:
                    if (c != 'b') {
                        estado = -1;
                    }
                    break;
                default:
                    if (c != 'c') {
                        estado = -1;
                    }
            }
        }
        return estado > 0;
    }

    /**
     * A03 (segundo). Autómata para validar: 1+/0+1* (válidas: 111, 0, 0011)
     * Recorre la cadena con estados y acepta si termina en q1, q2 o q3.
     *
     * @param cadena texto a validar
     * @return true si la cadena cumple el patrón, false si no
     */
    public boolean g1A03bAutomata(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length() && estado != -1; i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == '1') {
                        estado = 1;
                    } else if (c == '0') {
                        estado = 2;
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (c != '1') {
                        estado = -1;
                    }
                    break;
                case 2:
                    if (c == '0') {
                        estado = 2;
                    } else if (c == '1') {
                        estado = 3;
                    } else {
                        estado = -1;
                    }
                    break;
                default:
                    if (c != '1') {
                        estado = -1;
                    }
            }
        }
        return estado > 0;
    }

    /**
     * A04. Compilador para validar número decimal: dígitos, punto y dígitos (válidos: 3.14, 0.5)
     * Recorre la cadena con estados y acepta si termina en el estado final q3.
     *
     * @param cadena texto a validar
     * @return true si la cadena es un número decimal, false si no
     */
    public boolean g1A04CompiladorDecimal(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length() && estado != -1; i++) {
            char c = cadena.charAt(i);
            boolean esDigito = c >= '0' && c <= '9';
            switch (estado) {
                case 0:
                    if (esDigito) {
                        estado = 1;
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (esDigito) {
                        estado = 1;
                    } else if (c == '.') {
                        estado = 2;
                    } else {
                        estado = -1;
                    }
                    break;
                case 2:
                    if (esDigito) {
                        estado = 3;
                    } else {
                        estado = -1;
                    }
                    break;
                default:
                    if (!esDigito) {
                        estado = -1;
                    }
            }
        }
        return estado == 3;
    }
}