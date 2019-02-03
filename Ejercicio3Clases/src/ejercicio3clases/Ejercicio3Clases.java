/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3clases;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio3Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tiempo t = new Tiempo(1, 20, 30);
        int n = 1;
        System.out.println(t);
        //While para que cuando introduzcas un 0 se cierre el programa
        while (n > 0) {
            System.out.println(" 1.Suma"
                    + "\n 2.Resta"
                    + "\n 0.Cerrar programa");
            n = sc.nextInt();

            if (n != 0) {
                switch (n) {
                    case 1:
                        t.Suma();
                        break;
                    case 2:
                        t.Resta();
                        break;
                }

            }
        }
    }
}
