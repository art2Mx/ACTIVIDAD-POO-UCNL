import java.util.Scanner;

public class Pastel extends Postre {
    String tipo;

    public Pastel(Scanner sc) {
        super(sc);
        System.out.println("¿Si es tres leches o no? (si o no)");
        tipo = sc.nextLine();
    }

    @Override
    public void anuncio() {
        super.anuncio();
        System.out.println("El pastel " + tipo + " es tres leches");
    }
}
