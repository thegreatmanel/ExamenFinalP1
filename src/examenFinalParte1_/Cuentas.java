package examenFinalParte1_;

import java.io.IOException;

public class Cuentas {

    public static void main(String[] args) throws IOException {
        primeiraconta();
        segundaconta();
        terceiraconta();
    }

    public static void terceiraconta() {
        Main mn = new Main();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }

    public static void segundaconta() {
        Main nm = new Main(10);
        int m = nm.i;
        System.out.println("Es: " + m);
    }

    public static void primeiraconta() {
        Main obj = new Main(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
    }
}
