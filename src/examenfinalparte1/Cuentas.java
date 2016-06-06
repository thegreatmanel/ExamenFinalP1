package examenfinalparte1;

import java.io.IOException;

public class Cuentas {

    public static void main(String[] args) throws IOException {
        Main obj = new Main(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        Main nm = new Main(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        Main mn = new Main();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
