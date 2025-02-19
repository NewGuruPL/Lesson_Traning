public class ArrayFactory {

    int dlugosc;

    void tablicaJednowymiarowa() {
        int oneDimension[] = new int[dlugosc];
        for (int i = 0; i < oneDimension.length; i++) {
            System.out.print(oneDimension[i]);
            System.out.println();
        }
    }

    void tablicaDwuwymiarowa() {
        int twoDimension[][] = new int[dlugosc][dlugosc];
            for (int i = 0; i < twoDimension.length; i++) {
                for (int j = 0; j < twoDimension[i].length; j++)
                    System.out.print(twoDimension[i][j]);
                    System.out.println();
        }
    }
}
