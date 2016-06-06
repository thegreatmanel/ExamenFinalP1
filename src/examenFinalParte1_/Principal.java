package examenFinalParte1_;

public class Principal {

    int i;

    /**
     * este será o primer constructor
     *
     * @param j
     * @param m
     */
    public Principal(int j, int m) {
        i = met(j, m);
    }

    /**
     * este será o segundo
     *
     * @param j
     */
    public Principal(int j) {
        i = met(j, j);
    }

    /**
     * este será o terceiro
     */
    public Principal() {
        i = -1;
    }

    /**
     * este será o método
     *
     * @param x
     * @param x1
     * @return
     */
    public int met(int x, int x1) {
        return x + x1;
    }
}
