package examenFinalParte1_;

public class Main {

    int i;

    public Main(int j, int m) {
        i = met(j, m);
    }

    public Main(int j) {
        i = met(j, j);
    }

    public Main() {
        i = -1;
    }

    public int met(int x, int x1) {
        return x + x1;
    }
}
