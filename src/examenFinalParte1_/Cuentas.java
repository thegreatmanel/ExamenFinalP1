package examenFinalParte1_;

import java.io.IOException;

/**
 * @version 2.0
 * @author propa Nesta clase estarán todas as contas que executa o programa e as
 * amosa en pantalla
 */
public class Cuentas {

    /**
     *
     * @param args
     * @throws IOException Aquí habremos creado os métodos coas contas
     */
    public static void main(String[] args) throws IOException {
        primeiraconta();
        segundaconta();
        terceiraconta();
    }

    /**
     * Neste fará a primeira conta
     */
    public static void primeiraconta() {
        Principal obj = new Principal(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
    }

    /**
     * Neste fará a segunda conta
     */
    public static void segundaconta() {
        Principal nm = new Principal(10);
        int m = nm.i;
        System.out.println("Es: " + m);
    }

    /**
     * Neste parte fará a terceira conta
     */
    public static void terceiraconta() {
        Principal mn = new Principal();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }

}
