package ejercicios;

import java.util.Scanner;

public class tablaMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero y temuestro su tabla de multiplicar");
        int num = sc.nextInt();
        int resu;
        for(int i = 0; i <= 10; i++){
            resu = num * i;
            System.out.println(num + " x " +i+ " = " +resu);
        }
    }
}
