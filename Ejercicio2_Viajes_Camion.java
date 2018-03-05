
/**
 * Escriba una clase en Java un programa que modele el camión de una empresa de transporte: el camión va a
 * llevar una carga de Bogotá a Sasaima. El camión es capaz de transportar un número determinado de kilos en
 * un viaje y en cada viaje consume un número determinado de galones de gasolina por kilómetro. El programa
 * debe leer estos datos y encontrar la siguiente información:
 * a. Determinar el número de viajes que va a realizar el camión si va a llevar una carga a Sasaima. El
 * método deberá obtener también el número de galones de gasolina que se necesitan para todos los
 * viajes.
 */
import java.util.Scanner;
public class Ejercicio2_Viajes_Camion {
    public static void main(String[] args) {
       System.out.println("Escriba una clase en Java un programa que modele el camión de una empresa de transporte: el camión va a,");
       System.out.println("llevar una carga de Bogotá a Sasaima. El camión es capaz de transportar un número determinado de kilos en");
       System.out.println("un viaje y en cada viaje consume un número determinado de galones de gasolina por kilómetro. El programa");
       System.out.println("debe leer estos datos y encontrar la siguiente información:");
       System.out.println("Determinar el número de viajes que va a realizar el camión si va a llevar una carga a Sasaima. El");
       System.out.println("método deberá obtener también el número de galones de gasolina que se necesitan para todos los viajes.");
       System.out.println(" ");

       double Kilos;
       double Gasolina;
       double KilosCamion;       

       Scanner Teclado= new Scanner (System.in);    
       System.out.println("Kilos para carga en el camion: ");
       Kilos = Teclado.nextFloat();
       System.out.println("Kilos que puede cargar el camion: ");
       KilosCamion = Teclado.nextFloat();
       System.out.println("Consumo de galones por Kilometro: ");
       Gasolina = Teclado.nextFloat();
       System.out.println("Distancia bogota-sasaima: 78.6 ");
       double Nv=numerodeviajes(Kilos,KilosCamion);  
       System.out.println("No de viajes de idá y vuelta: " +Nv);
       double Ng=numerodegasolina(Nv,Gasolina);
       System.out.println("Galones de gasolina : " +Ng);

    } 
    static double numerodeviajes(double k, double kc){   

        double Viajes=0;
        Viajes= k/kc;
        Viajes=Math.ceil(Viajes);
        return Viajes;    
    }   

    static double numerodegasolina(double n, double g){     

        double Gasolina=0;
        double K=78.6;
        Gasolina=g*K*n*2;
        return Gasolina;       
    }        

}