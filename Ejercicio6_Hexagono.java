
/**
 * Un hexágono regular en una figura geométrica, cuya área depende de la dimensión del lado (L) y del apotema
 * (ap) del hexágono. Escriba un programa en Java que obtenga los datos necesarios del usuario y halle el área de
 * acuerdo a la siguiente fórmula: Área = (6·L·ap)/2
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
