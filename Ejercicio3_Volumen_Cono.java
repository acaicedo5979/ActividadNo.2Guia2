
/**
 * Un tronco de cono, es una figura geométrica resultante de cortar la parte superior de un cono normal, tal como
 * se puede ver en la figura a continuación:
 * El volumen de un cono se halla fácilmente multiplicando el área de la base (que para el cono es un círculo, y el
 * área se calcula como A = ?r ) por la altura. Su misión ahora es escribir un programa en Java que halle el 2
 * volumen del tronco de cono, a partir de los datos necesarios.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio3_Volumen_Cono
{
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese valor para la base");
        int Base = Integer.parseInt(br.readLine());
        System.out.print("Ingrese valor para la altura");
        int Altura = Integer.parseInt(br.readLine());
        System.out.print("Ingrese valor para el radio");
        int Radio = Integer.parseInt(br.readLine());
        double Pi = 3.1416;
        double Area_Cono = (Pi*(Radio*Radio));
        double Volumen_Cono = Area_Cono * Altura;
        System.out.println("El area del cono es: "+ Area_Cono);
        System.out.println("El volumen del cono es: "+ Volumen_Cono);
        System.out.print("Ingrese valor de la altura del cono que se cortÃ³");
        int Altura2 = Integer.parseInt(br.readLine());
        double Altura_final = Altura - Altura2;
        double Volumen_Cono2 = Area_Cono * Altura_final ;
        System.out.println("El Volumen final del cono es: "+ Volumen_Cono2);        
    }
}
