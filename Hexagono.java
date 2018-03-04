
/**
 * Write a description of class Hexagono here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hexagono
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
