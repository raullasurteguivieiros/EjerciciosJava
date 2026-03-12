package ejercicios;

import java.util.Scanner;

public class mediaDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        System.out.println("introduce tres numeros y hare la media ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        media = (num1 + num2 + num3) / 3;

        System.out.println("la media es = " +media);

}
}
