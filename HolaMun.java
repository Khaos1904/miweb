public class HolaMundo {

       public static void main (String args[]){


        System.out.println("esta es solo una prueba de JAVA");

        System.out.println("Modificación del archivo de seguimiento");

        int numeroUno =10, numeroDos = 20;
        int suma = numeroDos + numeroUno, resta = numeroDos-numeroUno;

        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplación es : "+numeroUno*numeroDos);
        System.out.println("La división es : "+(numeroUno/numeroDos));
        System.out.println("Con la función suma es: " + funcionSumar(numeroUno,numeroDos));
        System.out.println("Esta monda no funcionó");
        
    }
    
    
    static final int funcionSumar(int n, int m){
        int sumar = n+m;
        return sumar;
    }
    
    public HolaMundo(){

    }
}