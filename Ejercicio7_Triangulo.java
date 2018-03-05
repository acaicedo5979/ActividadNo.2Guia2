
/**
 * Para un triángulo cualquiera, donde sus lados miden a, b y c centímetros, se tienen las siguientes definiciones.
 *  El semiperímetro es la mitad del perímetro del triángulo y se halla con la fórmula s = (a+b+c)/2
 *  También se puede calcular el área a partir de su semiperímetro y las longitudes de los lados con la siguiente fórmula:
 *  A = raiz(s·(s-a)·(s-b)·(s-c))
 *  También puede ser calculado el circumradius R de un triángulo a partir de la fórmula: R = abc/(4pi*raiz(s(s-a)(s-b)(s-c)))
 *  Escriba un programa en Java que lea los tres lados del triángulo y permite
 *  calcular y mostrar el semiperímetro, el área y el circumradius de ese triángulo.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio7_Triangulo
{
    public static void main(String[] args) throws IOException { 
        System.out.println("Para un triángulo cualquiera, donde sus lados miden a, b y c centímetros, se tienen las siguientes definiciones.");
        System.out.println("El semiperímetro es la mitad del perímetro del triángulo y se halla con la fórmula s = (a+b+c)/2");
        System.out.println("También se puede calcular el área a partir de su semiperímetro y las longitudes de los lados con la siguiente fórmula:");
        System.out.println("A = raiz(s·(s-a)·(s-b)·(s-c))");
        System.out.println("También puede ser calculado el circumradius R de un triángulo a partir de la fórmula: R = abc/(4pi*raiz(s(s-a)(s-b)(s-c))) ");
        System.out.println("Escriba un programa en Java que lea los tres lados del triángulo y permite");
        System.out.println("calcular y mostrar el semiperímetro, el área y el circumradius de ese triángulo.");
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