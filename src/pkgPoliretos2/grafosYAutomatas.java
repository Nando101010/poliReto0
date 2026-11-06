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

    // =========================================================================
    // AGREGADO POR CARLOS (A05 al A07)
    // =========================================================================

    /**
     * A05. Compilador para validar la declaración de variables en Java.
     * Alfabeto aceptado: Letras (min/may), números, guión bajo (_) y dólar ($).
     * No puede empezar con número (debe empezar con letra, _ o $).
     *
     * @param cadena texto a validar
     * @return true si es una declaración válida, false si no
     */
    public boolean g1A05DeclaracionVariable(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length() && estado != -1; i++) {
            char c = cadena.charAt(i);
            boolean esLetra = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean esDigito = (c >= '0' && c <= '9');
            boolean esEspecial = (c == '_' || c == '$');

            switch (estado) {
                case 0:
                    if (esLetra || esEspecial) {
                        estado = 1; // Estado de aceptación para identificadores válidos
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (esLetra || esDigito || esEspecial) {
                        estado = 1;
                    } else {
                        estado = -1;
                    }
                    break;
                default:
                    estado = -1;
            }
        }
        return estado == 1;
    }

    /**
     * A06. Compilador para validar palabras clave de estructuras de control: for, if, else, ifelse, foreach.
     * 
     * @param cadena texto a validar
     * @return true si coincide con alguna palabra clave permitida, false si no
     */
    public boolean g1A06PalabrasClave(String cadena) {
        if (cadena == null) return false;
        String lim = cadena.trim();
        return lim.equals("for") || lim.equals("if") || lim.equals("else") || 
               lim.equals("ifelse") || lim.equals("foreach");
    }

    /**
     * A07. Validador de clave segura.
     * Criterios: Al menos una mayúscula, una minúscula, un número y un carácter especial.
     * 
     * @param clave texto de la contraseña a evaluar
     * @return true si cumple todos los requisitos de seguridad, false si no
     */
    public boolean g1A07ValidadorClave(String clave) {
        if (clave == null) return false;
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                tieneMayuscula = true;
            } else if (c >= 'a' && c <= 'z') {
                tieneMinuscula = true;
            } else if (c >= '0' && c <= '9') {
                tieneNumero = true;
            } else {
                // Consideramos cualquier otro símbolo como carácter especial
                tieneEspecial = true;
            }
        }
        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial;
    }
}