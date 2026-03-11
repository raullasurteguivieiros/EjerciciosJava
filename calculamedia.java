package ejercicios;

import java.util.Scanner;

public class calculamedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media = 0;
        System.out.println("Calcula Media Asignatura programacion");


        System.out.println("introduce la nota de la primera evaluacion");

        double prim = sc.nextDouble();

        System.out.println("introduce la nota de la segunda evaluacion");
        double sec = sc.nextDouble();

        System.out.println("introduce la nota de la tercera evaluacion");
        double ter = sc.nextDouble();

        System.out.println("su media es .......");

        media = (prim + sec + ter)/3;
        System.out.println(media);
    }


}
