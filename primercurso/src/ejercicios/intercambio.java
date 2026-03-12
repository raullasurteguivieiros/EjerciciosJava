package ejercicios;

import java.util.Scanner;

public class intercambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux;
        System.out.println("intercambio de valores");

        System.out.println("dime el primer numero");
        int num1 = sc.nextInt();

        System.out.println("dime el segundo numero");
        int num2 = sc.nextInt();
        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("el primer numero ahora vale " +num1+ " y el segundo vale " +num2);

}
}
