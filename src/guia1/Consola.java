
package guia1;

import java.util.Scanner;


public class Consola {
    
    public static void main(String[] args) {
       Scanner ingreso = new Scanner(System.in);
       Calculadora cal1 = new Calculadora();
       int segun;
       char opc;
       do{
       System.out.println("\t--CALCULADORA--\n1. basicas\n2. trigonometricas\n3. otros\n4. Terminar\nSeleccione una opcion: ");
       opc = ingreso.next().charAt(0);
       ingreso.nextLine();
       
       switch(opc){
           case '1' -> { 
               System.out.println("--BASICAS--\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\nSeleccione una opcion:");
               segun = ingreso.next().charAt(0);
               ingreso.nextLine();
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
                       if(cal1.num2!=0){
                       cal1.divi();
                       System.out.println("\tRespuesta:" + cal1.result);
                       }else{
                           System.out.println("\tMath error");   
                       }      
                   }
                   default -> System.out.println("Opcion invalida, intentalo de nuevo");
               }
            }
           case '2' -> {
               System.out.println("--TRIGONOMETRIA--\n1.Seno\n2.Coseno\n3.Tangente\nSeleccione una opcion:");
               segun = ingreso.next().charAt(0);
               ingreso.nextLine();
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
                   default -> System.out.println("Opcion invalida, intentalo de nuevo");
               }
            }
           case '3' -> {
               System.out.println("--OTROS--\n1.Raiz enesima\n2.Potencia enesima\n3.Calculo IVA\nSeleccione una opcion:");
               segun = ingreso.next().charAt(0);
               ingreso.nextLine();
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
                       double a= ingreso.nextFloat();
                       System.out.println("Digite el valor del iva en %: ");
                       double b= ingreso.nextFloat();
                       cal1.iva(a,b);
                       System.out.println("\tRespuesta:" + cal1.result);
                   }
                   
                   default -> System.out.println("Opcion invalida, intentalo de nuevo.");
               }
            }
           case'4'->{
                       System.out.println("Hasta la proxima :D");     
                   }
           default -> System.out.println("Opcion invalida, intentalo de nuevo");
       }
    }while(opc!='4');
   }    
}
