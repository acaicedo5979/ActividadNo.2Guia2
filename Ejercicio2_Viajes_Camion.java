
/**
 * Escriba una clase en Java un programa que modele el camión de una empresa de transporte: el camión va a
 * llevar una carga de Bogotá a Sasaima. El camión es capaz de transportar un número determinado de kilos en
 * un viaje y en cada viaje consume un número determinado de galones de gasolina por kilómetro. El programa
 * debe leer estos datos y encontrar la siguiente información:
 * a. Determinar el número de viajes que va a realizar el camión si va a llevar una carga a Sasaima. El
 * método deberá obtener también el número de galones de gasolina que se necesitan para todos los
 * viajes.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio2_Viajes_Camion
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la cantidad de kilos a transportar");
        int Kilos = Integer.parseInt(br.readLine());
        System.out.print("Ingrese el consumo de galones por kilometro");
        int Gasolina = Integer.parseInt(br.readLine());
        int Distancia = 80;
        int Consumo_Total = Gasolina*Distancia;
        System.out.print("El consumo total de la gasolina es: " + Consumo_Total);        
    }
}
