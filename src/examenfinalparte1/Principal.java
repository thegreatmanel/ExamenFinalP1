package examenfinalparte1;

public class Principal {

    int i;

    public Principal(int j, int m) {
        i = met(j, m);
    }

    public Principal(int j) {
        i = met(j, j);
    }

    public Principal() {
        i = -1;
    }

    public int met(int x, int x1) {
        return x + x1;
    }
}
