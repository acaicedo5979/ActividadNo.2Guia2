
/**
 * Write a description of class Avion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Avion
{
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese cantidad de tiquetes vendidos para la clase 1");
        int Tiquetes_Clase1 = Integer.parseInt(br.readLine());
        System.out.println("Ingrese cantidad de tiquetes vendidos para la clase 2");
        int Tiquetes_Clase2 = Integer.parseInt(br.readLine());
        System.out.println("Ingrese cantidad de tiquetes vendidos para la clase 3");
        int Tiquetes_Clase3 = Integer.parseInt(br.readLine());
        int Venta_Tiquetes_Clase1 = Tiquetes_Clase1*500000;
        int Venta_Tiquetes_Clase2 = Tiquetes_Clase1*200000;
        int Venta_Tiquetes_Clase3 = Tiquetes_Clase1*125000;
        int Venta_Total = Venta_Tiquetes_Clase1 + Venta_Tiquetes_Clase2 + Venta_Tiquetes_Clase3;
        System.out.println("EL valor total de ingresos es: " + Venta_Total);
    }
}
