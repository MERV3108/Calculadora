
package guia1;

import java.util.Scanner;


public class Consola {
    
    public static void main(String[] args) {
       Scanner ingreso = new Scanner(System.in);
       Calculadora cal1 = new Calculadora();
       char segun;
       Boolean segir;
   
      do{
       segir=false;
       System.out.println("\t--CALCULADORA--\n1.basicas\n2. trigonometricas\n3. otros\n4. Terminar\nSeleccione una opcion:");
       char opc=(char) ingreso.nextFloat();
       
       switch(opc){
           case '1' -> { 
               System.out.println("\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\nSeleccione una opcion:");
               segun=(char) ingreso.nextFloat();
               switch(segun){
                   case'1'->{
                       System.out.println("Digite el primer numero: ");
                       cal1.num1= ingreso.nextFloat();
                       System.out.println("Digite el segundo numero: ");
                       cal1.num2= ingreso.nextFloat();
                       cal1.suma();
                       System.out.println("\tRespuesta:" + cal1.result);
                       break;
                   }
                   case'2'->{
                       System.out.println("Digite el primer numero: ");
                       cal1.num1= ingreso.nextFloat();
                       System.out.println("Digite el segundo numero: ");
                       cal1.num2= ingreso.nextFloat();
                       cal1.resta();
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   case'3'->{
                       System.out.println("Digite el primer numero: ");
                       cal1.num1= ingreso.nextFloat();
                       System.out.println("Digite el segundo numero: ");
                       cal1.num2= ingreso.nextFloat();
                       cal1.multi();
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   case'4'->{
                       System.out.println("Digite el primer numero: ");
                       cal1.num1= ingreso.nextFloat();
                       System.out.println("Digite el segundo numero: ");
                       cal1.num2= ingreso.nextFloat();
                       cal1.divi();
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
               }
            }
           case '2' -> {
               System.out.println("\n1.Seno\n2.Coseno\n3.Tangente\nSeleccione una opcion:");
               segun=(char) ingreso.nextFloat();
               switch(segun){
                   case'1'->{
                       System.out.println("Digite el numero :");
                       double x= ingreso.nextFloat();
                       cal1.sen(x);
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   case'2'->{
                       System.out.println("Digite el numero :");
                       double x= ingreso.nextFloat();
                       cal1.cos(x);
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   case'3'->{
                       System.out.println("Digite el numero :");
                       double x= ingreso.nextFloat();
                       cal1.tan(x);
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
               }
            }
           case '3' -> {
               System.out.println("\n1.Raiz enesima\n2.Potencia enesima\n3.Calculo IVA\nSeleccione una opcion:");
               segun=(char) ingreso.nextFloat();
               switch(segun){
                   case'1'->{
                       System.out.println("Digite el numero base:");
                       double x= ingreso.nextFloat();
                       System.out.println("Digite la raiz: ");
                       double y= ingreso.nextFloat();
                       cal1.raiz(x, y);
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   case'2'->{
                       System.out.println("Digite el numero base:");
                       double x= ingreso.nextFloat();
                       System.out.println("Digite la potencia: ");
                       double y= ingreso.nextFloat();
                       cal1.pot(x, y);
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   case'3'->{
                       System.out.println("Digite el precio base: ");
                       cal1.num1= ingreso.nextFloat();
                       System.out.println("Digite el valor del iva en %: ");
                       cal1.num2= ingreso.nextFloat();
                       cal1.iva();
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   case'4'->{
                       System.out.println("Hasta la proxima :D");
                       segir=true;
                   }
               }
            }  
       }
    }while(segir);
    }
    
}
