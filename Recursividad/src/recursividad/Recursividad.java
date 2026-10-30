package recursividad;

import java.util.Arrays;

public class Recursividad {
    
    public static void main(String[] args) {
       Integer[] numeros = {1,2,3,3,2,3,1};
       String[] arr_letras = {"A","B","C","B","A","B","D"};
       Integer[] numeros_invertir = {1,2,3,4,5};
       
       
       System.out.println(recursiva(5));
       System.out.println(invertir("miguel gei"));
       System.out.println(contarDigitos(5921));
       System.out.println("fibonacci de 5 es:" +" "+fibonacci(5));
       System.out.println("fibonacci de 10 es:" +" "+fibonacci(10));
       System.out.println("el maximo comun divisor de 45 y 75 es:"+" "+mcd(45,75));
       System.out.println("el maximo comun divisor de 47 y 91 es:"+" "+mcd(47,91));
       System.out.println("numero de ocurrencias de 3 es: "+count(numeros,7,3));
       System.out.println("numero de ocurrencias de 1 es: "+count(numeros,7,1));
       System.out.println("numero de ocurrencias de C es: "+count(arr_letras,7,"C"));
       System.out.println("numero de ocurrencias de E es: "+count(arr_letras,7,"E"));
       reverse(arr_letras,0,7-1);
       
       
    }
    
    public static int recursiva(int n){
        if (n==1){
        return 1;
        }else{
            int sumaAnterior = recursiva(n-1);
        return n + sumaAnterior;
        }
        
    }
    public static String invertir(String palabra){
        if (palabra == null || palabra.length() <= 1 ){
            return palabra;
        }
        
        return invertir(palabra.substring(1)) + palabra.charAt(0);
        
    }
    
    public static int contarDigitos(int n){
        n = Math.abs(n);
        if (n < 10){
            return 1;
        }
        return 1 + contarDigitos(n/10);
    
    }
    
    public static long fibonacci(int n){
        if (n <= 1){
            return n;
        }
        
            return fibonacci(n-1) + fibonacci(n-2)  ;
        
    }
    
    public static int mcd(int a, int b){
        if(b == 0){
            return a;
        }
        return mcd(b, a % b);
    
    }
    public static int count(Object datos[], int n, Object o){
        if(n == 0){
        return 0;
        }
        if (datos[n-1].equals(o)){
        return 1 + count(datos,n-1,o);
        } 
        return count(datos,n-1,o);
    }
    
    public static void reverse(Object datos[], int inicio, int fin){
    if (inicio >= fin){
        System.out.println("Aqui esta su lista al reverso: "+ Arrays.toString(datos));
        return;
    }
    else{
        Object temporal = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temporal;
        reverse(datos,inicio+1,fin-1);
        
    }
   }
}
