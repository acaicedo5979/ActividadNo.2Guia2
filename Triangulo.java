
/**
 * Write a description of class Triangulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Triangulo
{
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double Pi = 3.1416;
        System.out.println("Ingrese valor de el lado A");
        int Lado_A = Integer.parseInt(br.readLine());
        System.out.println("Ingrese valor de el lado B");
        int Lado_B = Integer.parseInt(br.readLine());
        System.out.println("Ingrese valor de el lado C");
        int Lado_C = Integer.parseInt(br.readLine());
        double Semiperimetro = (Lado_A + Lado_B + Lado_C)/2;
        System.out.println("EL Semiperimetro es: " + Semiperimetro );
        double Area = Math.sqrt(Semiperimetro*(Semiperimetro-Lado_A)*(Semiperimetro-Lado_B)*(Semiperimetro-Lado_C));
        double Radio = (Lado_A * Lado_B * Lado_C)/(4*Pi)*(Math.sqrt(Semiperimetro*(Semiperimetro-Lado_A)*(Semiperimetro-Lado_B)*(Semiperimetro-Lado_C)));
     }
}