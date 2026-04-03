import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos postres hay en el menú? (número)");
        int cantidad = sc.nextInt();

        sc.nextLine();

        //Polimorfismo
        Postre[] p = new Postre[cantidad];

        for(int i = 0; i < cantidad; i++) {
            System.out.println("¿Qué tipo de postre es el postre numero " + (i + 1) + "? Pastel o Gelatina");
            String tipo = sc.nextLine();

            if (tipo.equalsIgnoreCase("Gelatina")) {
                p[i] = new Gelatina(sc);
            }
            else if (tipo.equalsIgnoreCase("Pastel")) {
                p[i] = new Pastel(sc);
            }
            else {
                System.out.println("No fue válido el dato, ingresar nuevamente");
                i--;
            }
        }

        System.out.println("--==::POSTRES::==--");
        for (int i = 0; i < cantidad; i++) {
           p[i].anuncio();
           System.out.println("===================");
        }
    }
}
