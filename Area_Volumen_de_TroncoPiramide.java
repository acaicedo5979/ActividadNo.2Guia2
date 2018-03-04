/**
 * Un tronco de pir�mide cuadrangular es una figura geom�trica tridimensional, 
 * tal como se presenta en la figuraa continuaci�n, donde b es la dimensi�n del 
 * lado del cuadrado superior, y B es la dimensi�n del lado de cuadrado inferior, 
 * y h es la altura del tronco. Escriba programa en Java que solicite la informaci�n 
 * necesaria para armar un tronco de pir�mide, y que calcule y muestre:
 * a. El �rea del tronco de pir�mide
 * b. El volumen del tronco.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Area_Volumen_de_TroncoPiramide
{
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese valor para la base inferior");
        int Base_Inferior = Integer.parseInt(br.readLine());
        System.out.println("Ingrese valor para la altura");
        int Altura = Integer.parseInt(br.readLine());
        System.out.println("Ingrese valor para la base superior");
        int Base_Superior = Integer.parseInt(br.readLine());
        float Area_Base_Inferior = Base_Inferior*Base_Inferior;
        float Area_Base_Superior = Base_Superior*Base_Superior;
        float Permitro_Base_Inferior = 4*Base_Inferior;
        float Perimetro_Base_Superior = 4*Base_Superior;
        float Area_Piramide = (Area_Base_Inferior+Area_Base_Superior+((Permitro_Base_Inferior+Perimetro_Base_Superior)/2)*Altura);
        System.out.println("El area de la piramide es: "+ Area_Piramide);
        double Volumen_Piramide = ((Altura/3)*(Area_Base_Inferior+Area_Base_Superior+((Math.sqrt(Area_Base_Inferior*Area_Base_Superior)))));
        System.out.println("El Volumen de la piramide es: "+ Volumen_Piramide);        
    }
}
