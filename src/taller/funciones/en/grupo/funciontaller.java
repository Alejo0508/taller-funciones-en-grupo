
package taller.funciones.en.grupo;


public class funciontaller {
    
    double promedio, costo, costototal;
    
    public double promedio (double materias, double notas)
    {
        promedio = notas / materias;
        return promedio;
    }
    
    public double costomaterias (double materias)
    {
    double costoMateria = 100000;    
        
    costo = materias * costoMateria;
    return costo;
    }
    
    public double descuento (double costoMateria)
    {
        double costopromedio;
                
    if (promedio >= 9)    
    {
     costopromedio = costoMateria * 0.3;
     costototal = costoMateria - costopromedio;
    }
    else
    {
    costopromedio = costoMateria * 0.1;
    costototal = costoMateria + costopromedio;
    }
    
    return costototal;
    
    } 
}
