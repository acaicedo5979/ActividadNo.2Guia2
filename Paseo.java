
/**
 * Write a description of class Paseo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Paseo
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
