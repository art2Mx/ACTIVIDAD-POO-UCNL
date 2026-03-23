import java.util.Scanner;

public class postre {

    String nombrePostre;
    int costoProduccion;
    double margenGanancia = 0.6;
    double precioVenta;

        public postre (Scanner sc) {
            System.out.print("Ingresar nombre del postre: ");
            nombrePostre = sc.nextLine();

            System.out.print("Costro de producción: $");
            costoProduccion = sc.nextInt();

            sc.nextLine();
            precioVenta = costoProduccion + (margenGanancia * costoProduccion);
            
        }

        public void anuncio() {
            System.out.println("Postre: " + nombrePostre);
            System.out.printf("Precio de venta: %.2f%n", precioVenta);
        }
} 