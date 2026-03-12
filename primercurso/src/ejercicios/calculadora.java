package ejercicios;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma;
        double resta;
        double multi;
        double divi;
    System.out.println("calculadora todo en uno");

    System.out.println("introduce el primer numero");
    double num1 = sc.nextDouble();
    System.out.println("Ahora introduzca el segundo numero");
    double num2 = sc.nextDouble();

    suma = num1 + num2;
    resta = num1 - num2;
    multi =  num1 * num2;
    divi = num1 / num2;

    System.out.println("La suma de los numeros es = " +suma);
    System.out.println("La resta de los numeros es = " +resta);
    System.out.println("La multiplicacion de los numeros es = " +multi);
    System.out.println("La division de los numeros es = " +divi);

}
}
