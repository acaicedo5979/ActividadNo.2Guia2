
/**
 * Un tronco de cono, es una figura geométrica resultante de cortar la parte superior de un cono normal, tal como
 * se puede ver en la figura a continuación: El volumen de un cono se halla fácilmente multiplicando el área de la base
 * (que para el cono es un círculo, y el área se calcula como A = pir^2 ) por la altura. Su misión ahora es escribir 
 * un programa en Java que halle el volumen del tronco de cono, a partir de los datos necesarios.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio3_Volumen_Cono
{
    public static void main(String[] args) throws IOException {
        
       System.out.println("Un tronco de cono, es una figura geométrica resultante de cortar la parte superior de un cono normal, tal como");
       System.out.println("se puede ver en la figura a continuación: El volumen de un cono se halla fácilmente multiplicando el área de la base");
       System.out.println("(que para el cono es un círculo, y el área se calcula como A = pir^2 ) por la altura. Su misión ahora es escribir ");
       System.out.println("un programa en Java que halle el volumen del tronco de cono, a partir de los datos necesarios");
       System.out.println(" ");
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Ingrese valor para la altura ");
       int Altura = Integer.parseInt(br.readLine());
       System.out.print("Ingrese valor para el radio ");
       int Radio = Integer.parseInt(br.readLine());
       double Pi = 3.1416;
       double Area_Cono = (Pi*(Radio*Radio));
       double Volumen_Cono = (Area_Cono * Altura)/3;
       System.out.println("El area del cono es: "+ Area_Cono);
       System.out.println("El volumen completo del cono es: "+ Volumen_Cono);
       System.out.print("Ingrese valor de la altura del cono que se corta ");
       int Altura2 = Integer.parseInt(br.readLine());
       double Altura_final = Altura - Altura2;
       double Volumen_Cono2 = Area_Cono * Altura_final ;
       System.out.println("El Volumen del cono truncado del cono es: "+ Volumen_Cono2);        
    }
}
