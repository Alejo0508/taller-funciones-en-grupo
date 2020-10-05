/* En una escuela la colegiatura de los alumnos se determina según el numero de materias que cursan. El costo de todas las materias es el mismo.
Se ha establecido un programa para estimular a los alumnos, el cual consiste en lo siguiente: 

si el promedio obtenido por un alumno en el ultimo periodo es mayor o igual que 9, se le hará un descuento del 30% sobre la colegiatura y no se le cobrara IVA; 
si el promedio obtenido es menor que 9 deberá pagar la colegiatura completa, la cual incluye el 10% de IVA.

Obtener cuanto debe pagar un alumno.*/
package taller.funciones.en.grupo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TallerFuncionesEnGrupo {

    public static void main(String[] args) {
     
        DecimalFormat nro = new DecimalFormat ("###,###");
        
        double promedio, costoMateria, notas, notastot,costototal;
        int materias, i;
        
        Scanner entrada = new Scanner (System.in);
        
        notas = 0;
        notastot = 0;
        
        funciontaller totalpromedio = new funciontaller ();
        
        System.out.print("Ingrese la cantidad de materias: ");
        materias = entrada.nextInt();
        
        for (i = 0; i < materias; i ++)
        {
            System.out.print("Ingrese la nota "+(i+1)+": ");
            notas = entrada.nextDouble();
            
            notastot = notastot + notas;     
        }
        
        promedio =  totalpromedio.promedio(materias, notastot);
        
        costoMateria = totalpromedio.costomaterias(materias);
        
        costototal = totalpromedio.descuento(costoMateria);
        
        System.out.println("");
        System.out.println("");
        System.out.print("el promedio es: "+promedio);
        System.out.println("");
        System.out.print("Recuerde que cada materia vale 100.000");
        System.out.println("");
        System.out.println("El total a pagar es: "+nro.format(costototal));
        
        System.out.println("");
        
        
        
    }
    
}
