//SE IMPORTA EL SCANNER
import java.util.Scanner;

//SE CREA LA CLASE POSTRE QUE HEREDA EL CONSTRUCTOR Y EL METODO VOID DE LA CLASE POSTRE
public class Pastel extends Postre {

    //ESTE ATRIBUTO ES UNICO DE LA CLASE PASTEL
    String tipo;

    //LA LINEA SUPER(SC); INDICA QUE SE HEREDA EL CONSTRUCTOR DE LA CLASE POSTRE
    public Pastel(Scanner sc) {
        super(sc);

        //AQUI SE PIDE CAPTURAR LA VARIABLE TIPO
        System.out.println("¿Si es tres leches o no? (si o no)");
        tipo = sc.nextLine();
    }

    //METODO VOID QUE HEREDA LA INFORMACION DEL METODO VOID DE POSTRE Y AGREGA EL ATRIBUTO TIPO ANTES MENCIONADO EN ESTA CLASE
    public void anuncioPastel() {
        anuncioPostre();
        System.out.println("El pastel " + tipo + " es tres leches");
    }
}
