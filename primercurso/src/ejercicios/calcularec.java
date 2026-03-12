package ejercicios;

import java.util.Scanner;

public class calcularec {
    public class Main { public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el largo del rectángulo");

        double largo = sc.nextDouble();

        System.out.println("Ingrese el ancho del rectángulo");

        double ancho = sc.nextDouble();

        while(ancho == largo) {
            System.out.println("El número ingresado como ancho debe ser menor al número");

            System.out.println("Ingrese el largo del rectángulo");

            largo = sc.nextDouble();

            System.out.println("Ingrese el ancho del rectángulo");

            ancho = sc.nextDouble();
        }

        double perimetro = Math.round((2 * ancho)  + (2 * largo));
        double area = Math.round(ancho * largo);

        System.out.println("El perímetro del rectángulo es:"  + perimetro + " Y su área es:" + area);
    }
    }
}
