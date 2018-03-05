
/**
 * Escriba una clase en Java un programa que modele el cami�n de una empresa de transporte: el cami�n va a
 * llevar una carga de Bogot� a Sasaima. El cami�n es capaz de transportar un n�mero determinado de kilos en
 * un viaje y en cada viaje consume un n�mero determinado de galones de gasolina por kil�metro. El programa
 * debe leer estos datos y encontrar la siguiente informaci�n:
 * a. Determinar el n�mero de viajes que va a realizar el cami�n si va a llevar una carga a Sasaima. El
 * m�todo deber� obtener tambi�n el n�mero de galones de gasolina que se necesitan para todos los
 * viajes.
 */
import java.util.Scanner;
public class Ejercicio2_Viajes_Camion {
    public static void main(String[] args) {
       System.out.println("Escriba una clase en Java un programa que modele el cami�n de una empresa de transporte: el cami�n va a,");
       System.out.println("llevar una carga de Bogot� a Sasaima. El cami�n es capaz de transportar un n�mero determinado de kilos en");
       System.out.println("un viaje y en cada viaje consume un n�mero determinado de galones de gasolina por kil�metro. El programa");
       System.out.println("debe leer estos datos y encontrar la siguiente informaci�n:");
       System.out.println("Determinar el n�mero de viajes que va a realizar el cami�n si va a llevar una carga a Sasaima. El");
       System.out.println("m�todo deber� obtener tambi�n el n�mero de galones de gasolina que se necesitan para todos los viajes.");
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
       System.out.println("No de viajes de id� y vuelta: " +Nv);
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