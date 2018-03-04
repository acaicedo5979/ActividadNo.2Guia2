
/**
 * Para un triángulo cualquiera, donde sus lados miden a, b y c centímetros, se tienen las siguientes definiciones.
 *  El semiperímetro es la mitad del perímetro del triángulo y se halla con la fórmula s = (a+b+c)/2
 *  También se puede calcular el área a partir de su semiperímetro y las longitudes de loslados con la siguiente fórmula:
 *  A = ?(s·(s ? a)·(s ? b)·(s ? c))
 *  También puede ser calculado el circumradius R de un triángulo a partir de la fórmula: R = abc/(4??(s(s?a)(s?b)(s?c)))
 *  Escriba un programa en Java que lea los tres lados del triángulo y permite
 *  calcular y mostrar el semiperímetro, el área y el circumradius de ese triángulo.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio7_Triangulo
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