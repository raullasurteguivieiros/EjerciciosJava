package ejercicios;

import java.util.Scanner;
public class espar {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("programa que detecta si es par o impar un numero");
    System.out.println("introduce tu numero");
    int num = sc.nextInt();

    if(num % 2 == 0 ){
        System.out.println("el numero " +num+ " es un numero par");
    }else{
        System.out.println("el numero " +num+ " es un numero impar");
    }

}
}
