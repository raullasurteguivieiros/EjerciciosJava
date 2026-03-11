package ejercicios;

import java.util.Scanner;

    public class calculaprecio {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double imp = 0.21;
            double ganancia = 0.30;
            double preciosin ;
            double precio;
            System.out.println("introduce el precio");
            double costefrabrica = sc.nextInt();

            preciosin = costefrabrica + (costefrabrica * ganancia);
            precio = preciosin + preciosin * imp;

            if (precio <= 600) {
                System.out.println("El precio de su portatil es:" +precio+ " es normal");
            }else{
                System.out.println("El precio de su portatil es:" +precio+ " es de lujo");
            }


        }
    }




