import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        postre p1 = new postre(sc);
        postre p2 = new postre(sc);

        p1.anuncio();
        p2.anuncio();

        sc.close();
    }
}
