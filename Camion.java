
/**
 * Write a description of class Camion here.
 *
 * @author (your name)
 * de bogota a sasaima hay 80km
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Camion
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
