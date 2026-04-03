//IMPORTA SCANNER DE LIBRERIA INCLUIDA EN JAVA
import java.util.Scanner;

//CLASE MAIN
public class Main {
    
    //METODO MAIN, PUNTO DE INICIO DE UN PROGRAMA
    public static void main(String[] args) {

        //SE INICIALIZA EL SCANNER, SIRVE PARA LA FUNCIONALIDAD IN DEL BUFFER, INGRESAR DATOS
        Scanner sc = new Scanner(System.in);

        //SE DECLARA EL NUMERO DE "PASTELES" PARA GENERAR ESA MISMA CANTIDAD DE INSTANCIAS
        System.out.println("¿Cuantos pasteles hay en el menú?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        //SE INSTANCIA LA CLASE PASTEL
        Pastel[] pasteles = new Pastel[cantidad];

        //SE APARTA LA MEMORIA DINAMICA PARA CADA INSTANCIA GRACIAS AL ITERAR CON EL FOR Y LLAMA A LA CLASE PASTEL PARA EJECUTAR EL CONSTRUCTOR
        for (int i = 0; i < cantidad; i++) {
            pasteles[i] = new Pastel(sc);
        }

        /*
        SE ACCEDE A LA MEMORIA DONDE SE ALMACENARON LOS DATOS DE LOS OBJETOS, SE USA ITERACION PARA BUSCARLOS EMPEZANDO EN 0
        EL METODO .anuncioPastel(); sirve para ejecutar las instrucciones indicadas en ese método void 
        */
        System.out.println("--==::POSTRES::==--");
        for (int i = 0; i < cantidad; i++) {
            pasteles[i].anuncioPastel();
            System.out.println("===================");
        }

        sc.close();
    }
}
