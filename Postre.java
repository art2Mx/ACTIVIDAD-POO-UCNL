//SE IMPORTA EL SCANNER
import java.util.Scanner;

//CLASE POSTRE
public class Postre {
    String nombre, sabor;
    double precio;

    /*
    SE HACE EL CONSTRUCTOR DONDE SE CONTIENEN LAS INSTRUCCIONES DE LA INSTANCIACION
    EN EL ARGUMENTO SE INDICA QUE SE USARA EL SCANNER
    LAS LINEAS sc.nextLine/nextDouble(); SIRVEN PARA INGRESAR INFORMACION EN EL BUFFER Y QUE ESTE LA ALMACENE EN LOS ATRIBUTOS
    */
        public Postre(Scanner sc) {
        System.out.println("Nombre del pastel: ");
        nombre = sc.nextLine();
        System.out.println("¿Cuál es el precio de venta?");
        System.out.print("$");
        precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("¿Cuál es el sabor?");
        sabor = sc.nextLine();
    }

    //METODO VOID QUE TIENE LAS INSTRUCCIONES PARA MOSTRAR INFORMACION EN PANTALLA, EN ESTE CASO, LOS ATRIBUTOS DEL OBJETO.
    public void anuncioPostre() {
        System.out.println("Nombre: " + nombre);
        System.out.printf("Precio de venta: %.2f%n", precio);
        System.out.println("Sabor: " + sabor);
    }
}
