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
import java.util.Scanner;
public class Ejercicio4_Paseo {
    public static void main(String[] args) {
        
       System.out.println("Vamos a escribir un programa que nos permita organizar un paseo a Melgar. A ese paseo van estudiantes");
       System.out.println("gordos y flacos y tambi�n se debe contar con el n�mero de sillas que tienen los buses, el valor de un plato de");
       System.out.println("comida, el valor de una habitaci�n de hotel, el n�mero de personas que caben en una habitaci�n, el precio que");
       System.out.println("se paga por alquilar un bus y el n�mero de d�as que dura el paseo. El programa debe leer todos estos datos y");
       System.out.println("a. Hallar el n�mero de buses que se van a necesitar para el paseo, sabiendo que en un bus, los estudiantes");
       System.out.println("gordos ocupan dos sillas y los flacos s�lo una.");
       System.out.println("b. Determinar cu�nto dinero nos cuesta alquilar esos buses. Tenga en cuenta que se contratan tanto para ");
       System.out.println("ir como para regresar.");
       System.out.println("c. Encontrar el valor a pagar por la comida, sabiendo que los estudiantes gordos comen 5 veces al d�a,");
       System.out.println("mientras los estudiantes flacos solo comen 3 veces al d�a.");
       System.out.println("d. Hallar el n�mero de habitaciones que se necesitan reservar para que duerman los estudiantes.");
       System.out.println("e. Encontrar el valor a pagar por las habitaciones del hotel, diario y en total por la duraci�n del paseo.");
       System.out.println("");
      
       double flacos;
       double gordos;
       double sillas;
       double comida;
       double hotel;
       double personas_hab;
       double bus;
       double dias;
    
       Scanner Teclado= new Scanner (System.in);
       System.out.println("Ingrese el numero de personas flacas: ");
       flacos = Teclado.nextFloat();
       System.out.println("Ingrese el numero de Personas gordas: ");
       gordos = Teclado.nextFloat();
       System.out.println("Ingres numero de sillas del bus: ");
       sillas = Teclado.nextFloat();
       System.out.println("Valor por trayecto en bus: ");
       bus = Teclado.nextFloat();
       System.out.println("Precio de plato por persona: ");
       comida = Teclado.nextFloat();
       System.out.println("Numero de dias en el hotel: ");
       dias = Teclado.nextFloat();
       System.out.println("Numero maximo de personas por habitaci�n: ");
       personas_hab = Teclado.nextFloat();
       System.out.println("Valor por habitaci�n: ");
       hotel = Teclado.nextFloat();

       double Nbuses=buses(flacos,gordos,sillas);
       System.out.println("No. Buses: " +Nbuses);
       double Dtrans=transp(Nbuses,bus);
       System.out.println("Precio total para el transporte ida y regreso: " +Dtrans);
       double Dcomi=pcomida(comida,flacos,gordos,dias);
       System.out.println("Precio total para la comida: " +Dcomi);
       double Nhab=nhabita(flacos,gordos,personas_hab);
       System.out.println("Numero total de habitaciones: " +Nhab);
       double Vhab=vhabita(Nhab,hotel);
       System.out.println("Precio de habitaci�n por dia: " +Vhab);
       System.out.println("Precio total por las habitaci�n: " +Vhab*dias);
    }
    static double buses(double f, double g, double Si){
        double B=0;
        double N=(f+g*2)/Si;
        B=Math.ceil(N); 
        return B;      
    }
    static double transp(double Nb, double Vb){    
        double D=0;
        D=Nb*Vb*2;    
        return D;
    }
    static double pcomida(double plato, double f, double g, double dia){    
        double C=0;
        C=dia*((plato*g*5)+(plato*f*3));     
        return C;       
    }
    static double nhabita(double g, double f, double Nh){    
        double P=0;
        double N= (g+f)/Nh;
        P=Math.ceil(N);   
        return P;        
    }   
    static double vhabita(double n, double v){     
        double V=0;
        V= n*v;        
        return V;
    } 
}