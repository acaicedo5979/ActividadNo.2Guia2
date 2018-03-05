
/**
 * Para un tri�ngulo cualquiera, donde sus lados miden a, b y c cent�metros, se tienen las siguientes definiciones.
 *  El semiper�metro es la mitad del per�metro del tri�ngulo y se halla con la f�rmula s = (a+b+c)/2
 *  Tambi�n se puede calcular el �rea a partir de su semiper�metro y las longitudes de los lados con la siguiente f�rmula:
 *  A = raiz(s�(s-a)�(s-b)�(s-c))
 *  Tambi�n puede ser calculado el circumradius R de un tri�ngulo a partir de la f�rmula: R = abc/(4pi*raiz(s(s-a)(s-b)(s-c)))
 *  Escriba un programa en Java que lea los tres lados del tri�ngulo y permite
 *  calcular y mostrar el semiper�metro, el �rea y el circumradius de ese tri�ngulo.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio7_Triangulo
{
    public static void main(String[] args) throws IOException { 
        System.out.println("Para un tri�ngulo cualquiera, donde sus lados miden a, b y c cent�metros, se tienen las siguientes definiciones.");
        System.out.println("El semiper�metro es la mitad del per�metro del tri�ngulo y se halla con la f�rmula s = (a+b+c)/2");
        System.out.println("Tambi�n se puede calcular el �rea a partir de su semiper�metro y las longitudes de los lados con la siguiente f�rmula:");
        System.out.println("A = raiz(s�(s-a)�(s-b)�(s-c))");
        System.out.println("Tambi�n puede ser calculado el circumradius R de un tri�ngulo a partir de la f�rmula: R = abc/(4pi*raiz(s(s-a)(s-b)(s-c))) ");
        System.out.println("Escriba un programa en Java que lea los tres lados del tri�ngulo y permite");
        System.out.println("calcular y mostrar el semiper�metro, el �rea y el circumradius de ese tri�ngulo.");
        System.out.println("");

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
        System.out.println("EL Area es: " + Area );
        double Radio = (Lado_A * Lado_B * Lado_C)/(4*Pi)*(Math.sqrt(Semiperimetro*(Semiperimetro-Lado_A)*(Semiperimetro-Lado_B)*(Semiperimetro-Lado_C)));
        System.out.println("EL Circumradius es: " + Radio );
     }
}