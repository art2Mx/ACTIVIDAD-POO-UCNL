import java.util.Scanner;

public class Postre {

    String nombre;
    String nacionalidad;
    String temperatura;
    double precio;
    String sabor;

        public Postre(Scanner sc) {
            System.out.println("Nombre del postre: ");
            nombre = sc.nextLine();

            System.out.println("Nacionalidad del postre: ");
            nacionalidad = sc.nextLine();

            System.out.println("¿Es postre Frío, Caliente, o ambos?: ");
            temperatura = sc.nextLine();

            System.out.println("¿Cuál es el precio de venta?");
            System.out.print("$");
            precio = sc.nextDouble();

            sc.nextLine();

            System.out.println("¿Cuál es el sabor?");
            sabor = sc.nextLine();
        }

        public void anuncio() {
            System.out.println("Nombre: " + nombre);
            System.out.println("El postre proviene de: " + nacionalidad);
            System.out.println("El postre se sirve " + temperatura);
            System.out.printf("Precio de venta: %.2f%n", precio);
            System.out.println("Sabor: " + sabor);
        }
} 
