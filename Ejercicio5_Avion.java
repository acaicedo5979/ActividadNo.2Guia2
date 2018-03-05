
/**
 * Vamos a construir un programa para un avión. En esta programa vamos a almacenar el número de pasajeros
 * que viajan en cada una de las tres clases que posee. El avión se manejan divisiones o clases para los tiquetes: la
 * primera clase o clase 1, cuesta 500 mil por pasajero; la clase 2 cuesta 200 mil por pasajero y la clase 3, que
 * cuesta 125 mil por pasajero. En el programa debe leer la clase (un número entero, que puede ser 1, 2 o 3) y el
 * número de pasajeros que compraron tiquetes en esa clase y determine el valor total recolectado por la empresa
 * aérea, gracias a la venta de esos tiquetes en esa clase
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio5_Avion
{
    public static void main(String[] args) throws IOException {
       System.out.println("Vamos a construir un programa para un avión. En esta programa vamos a almacenar el número de pasajeros ");
       System.out.println("que viajan en cada una de las tres clases que posee. El avión se manejan divisiones o clases para los tiquetes: la");
       System.out.println("primera clase o clase 1, cuesta 500 mil por pasajero; la clase 2 cuesta 200 mil por pasajero y la clase 3, que");
       System.out.println("cuesta 125 mil por pasajero. En el programa debe leer la clase (un número entero, que puede ser 1, 2 o 3) y el");
       System.out.println("número de pasajeros que compraron tiquetes en esa clase y determine el valor total recolectado por la empresa");
       System.out.println("aérea, gracias a la venta de esos tiquetes en esa clase");
       System.out.println("");
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
