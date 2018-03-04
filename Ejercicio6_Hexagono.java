
/**
 * Un hex�gono regular en una figura geom�trica, cuya �rea depende de la dimensi�n del lado (L) y del apotema
 * (ap) del hex�gono. Escriba un programa en Java que obtenga los datos necesarios del usuario y halle el �rea de
 * acuerdo a la siguiente f�rmula: �rea = (6�L�ap)/2
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio6_Hexagono
{
     public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese valor de el lado");
        int Lado = Integer.parseInt(br.readLine());
        System.out.println("Ingrese valor de el apotema");
        int Apotema = Integer.parseInt(br.readLine());
        int Area = (6*(Lado*Apotema))/2;
        System.out.println("EL area es: " + Area);
    }
}
