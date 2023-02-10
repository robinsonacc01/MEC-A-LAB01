
package calculator_1;

import java.util.Scanner;

public class Calculator_1 {
    
    public static void suma(){
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el primer valor para sumar");
          int a = entrada.nextInt();
        System.out.println("Ingresa el segundo valor para sumar");
        int b = entrada.nextInt();
        
         int resultado = a + b;
        System.out.println("El resultado de la suma es " + resultado);  
        
        
    }
    public static void resta(){
        
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el primer valor para restar");
          int a = entrada.nextInt();
        System.out.println("Ingresa el segundo valor para restar");
        int b = entrada.nextInt();
        
         int resultado = a - b;
        System.out.println("El resultado de la resta es " + resultado); 
    }
    public static void multiplicacion(){
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el primer valor para multiplicar");
          int a = entrada.nextInt();
        System.out.println("Ingresa el segundo valor para multiplicar");
        int b = entrada.nextInt();
        
         int resultado = a * b;
        System.out.println("El resultado de la multiplicacion es " + resultado); 
    }
    public static void division(){
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el valor a dividir");
          int a = entrada.nextInt();
        System.out.println("Ingresa la cantidad por la que quieres dividir");
        int b = entrada.nextInt();
        
         int resultado = a / b;
        System.out.println("El resultado de la suma es " + resultado); 
        
    }
    public static void funciones(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la funcion que desee calular:\t1.sen\n2.cos\n3.tan\n");
        
        int t_funcion = entrada.nextInt();
        switch(t_funcion){
            
            case 1:
                System.out.println("Ingrese el angulo a calcular:");               
                int a = entrada.nextInt();
                double sen = Math.sin(a);
                System.out.println("El seno de " + a + " es " + sen);
            case 2:
                System.out.println("Ingrese el angulo a calcular:");               
                int b = entrada.nextInt();
                double cos = Math.cos(b);
                System.out.println("El seno de " + b + " es " + cos);                           
            case 3:
                System.out.println("Ingrese el angulo a calcular:");               
                int c = entrada.nextInt();
                double tan = Math.tan(c);
                System.out.println("El seno de " + c + " es " + tan);
                
            default:
                System.out.println("opcion invalida");
        }
        
        
    }
    public static void raiz(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el valor al que quiere sacar la raiz ");
        
        int a = entrada.nextInt();
     
        double resultado = Math.sqrt(a);
        
        System.out.println("el resultado de la raiz es de " + resultado);
        
        
    }
    public static void potencia(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese  el valor de la base:");       
        int a = entrada.nextInt();
        System.out.println("Ingrese el valor de la potencia");
        int b = entrada.nextInt();
        
        double resultado = Math.pow(a, b);
        
        System.out.println("El resultado de elevar " + a + " a " + b + " es igual a " + resultado);
         
    }
    public static void iva(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor a pagar");       
        double precio = entrada.nextDouble();        
        System.out.println("Ingrese el valor del IVA");       
        int iva = entrada.nextInt();
        
        double precio_f = (iva * precio)/100 + precio;
        
        System.out.println("El valor del producto mas el IVA es de " + precio_f + " pesos.");
        
        
    }
        

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\t Calculadora ");
        
        int opcion;
        
        System.out.println("1.Suma\n2.Resta\n3.Multiplicación\n4.Division\n5.Funciones trigonometricas\n6.Raiz enecima\n7.Potecia enecima\n8.Porcentaje de IVA\n\n");
        System.out.println("Ingrese la opcion que desee:");
        
        opcion = entrada.nextInt();
        
        switch(opcion){
            
            case 1 :
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            case 5:
                funciones();
                break;
            case 6:
                raiz();
                break;
            case 7:
                potencia();
                break;
            case 8:
                iva();
                break;
            default:
                System.out.println("opcion no valida");
                
        }
               
        
        
        
        
        
        
        
        
        
    
    }
    
}
