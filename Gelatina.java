import java.util.Scanner;

public class Gelatina extends Postre {
    String base;
    
    public Gelatina(Scanner sc) {
        super(sc);
        System.out.println("¿Es a base de agua o leche?");
        base = sc.nextLine();
    }

    @Override
    public void anuncio() {
        super.anuncio();
        System.out.println("La gelatina es base de: " + base);
    }
}
