/**
 * Vamos a escribir un programa que nos permita organizar un paseo a Melgar. A ese paseo van estudiantes
 * gordos y flacos y también se debe contar con el número de sillas que tienen los buses, el valor de un plato de
 * comida, el valor de una habitación de hotel, el número de personas que caben en una habitación, el precio que
 * se paga por alquilar un bus y el número de días que dura el paseo. El programa debe leer todos estos datos y
 * a. Hallar el número de buses que se van a necesitar para el paseo, sabiendo que en un bus, los estudiantes
 * gordos ocupan dos sillas y los flacos sólo una.
 * b. Determinar cuánto dinero nos cuesta alquilar esos buses. Tenga en cuenta que se contratan tanto para
 * ir como para regresar.
 * c. Encontrar el valor a pagar por la comida, sabiendo que los estudiantes gordos comen 5 veces al día,
 * mientras los estudiantes flacos solo comen 3 veces al día.
 * d. Hallar el número de habitaciones que se necesitan reservar para que duerman los estudiantes.
 * e. Encontrar el valor a pagar por las habitaciones del hotel, diario y en total por la duración del paseo.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio4_Paseo
{
       public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese cantidad de estudiantes flacos");
        int Estudiantes_Flacos = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese cantidad de estudiantes gordos");
        int Estudiantes_Gordos = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese cantidad de sillas por bus");
        int Numero_Sillas_Por_Bus = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese valor para cada plato");
        int Valor_Plato = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese valor por noche de hotel");
        int Valor_Por_Habitacion = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese cantidad de persona por habitaciÃ³n");
        int Cantidad_De_Personas_Por_Habitacion = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese valor por cada bus");
        int Valor_Por_Bus = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese numero de dias de paseo");
        int Numero_Dias_Paseo = Integer.parseInt(br.readLine());
        
        
    } 
}
