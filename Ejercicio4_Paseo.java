/**
 * Vamos a escribir un programa que nos permita organizar un paseo a Melgar. A ese paseo van estudiantes
 * gordos y flacos y tambi�n se debe contar con el n�mero de sillas que tienen los buses, el valor de un plato de
 * comida, el valor de una habitaci�n de hotel, el n�mero de personas que caben en una habitaci�n, el precio que
 * se paga por alquilar un bus y el n�mero de d�as que dura el paseo. El programa debe leer todos estos datos y
 * a. Hallar el n�mero de buses que se van a necesitar para el paseo, sabiendo que en un bus, los estudiantes
 * gordos ocupan dos sillas y los flacos s�lo una.
 * b. Determinar cu�nto dinero nos cuesta alquilar esos buses. Tenga en cuenta que se contratan tanto para
 * ir como para regresar.
 * c. Encontrar el valor a pagar por la comida, sabiendo que los estudiantes gordos comen 5 veces al d�a,
 * mientras los estudiantes flacos solo comen 3 veces al d�a.
 * d. Hallar el n�mero de habitaciones que se necesitan reservar para que duerman los estudiantes.
 * e. Encontrar el valor a pagar por las habitaciones del hotel, diario y en total por la duraci�n del paseo.
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
        
        System.out.println("Ingrese cantidad de persona por habitación");
        int Cantidad_De_Personas_Por_Habitacion = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese valor por cada bus");
        int Valor_Por_Bus = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese numero de dias de paseo");
        int Numero_Dias_Paseo = Integer.parseInt(br.readLine());
        
        
    } 
}
