
package guia1;

import java.util.Scanner;


public class Consola {
    
    public static void main(String[] args) {
       Scanner ingreso = new Scanner(System.in);
       Calculadora cal1 = new Calculadora();
       
       System.out.print("Ingrese el numero 1: \n");
       float a=ingreso.nextFloat();
       System.out.print("Ingrese el numero 2: \n");
       float b=ingreso.nextFloat();
       cal1.num1=a;
       cal1.num2=b;
       cal1.suma();
       System.out.println("La suma de los numeros es: "+cal1.result);
       
       cal1.cos(a);
        System.out.println("El coseno es: "+cal1.result);
    }
    
}
