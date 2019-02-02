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
public class Tiempo {

    private int hora, min, seg;

    public Tiempo() {
    }

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    @Override
    public String toString() {
        return this.hora + "h " + this.min + "m " + this.seg + "s.";
    }

    public void Suma() {
        int  st, mt=0, ht=0,aux;
        Scanner sc = new Scanner(System.in);
        String hora;
        System.out.println("Introduce la hora 1: ");
        hora = sc.nextLine();
        String[] parts = hora.split(":");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        int h1 = Integer.parseInt(parts[0]);
        int m1 = Integer.parseInt(parts[1]);
        int s1 = Integer.parseInt(parts[2]);
        String resta;
        System.out.println("Introduce la hora 2: ");
        resta = sc.nextLine();
        String[] parte = resta.split(":");
        String parte1 = parts[0];
        String parte2 = parts[1];
        String parte3 = parts[2];
        int h2 = Integer.parseInt(parte[0]);
        int m2 = Integer.parseInt(parte[1]);
        int s2 = Integer.parseInt(parte[2]);
       h1 = h1 * 60;
        h2 = h2 * 60;
        m1 = (m1 + h1) * 60;
        m2 = (m2 + h2) * 60;
        s1 = s1 + m1;
        s2 = s2 + m2;
        st=s1+s2;
        aux = st % 60;
        if (st > 60) {
            mt = st / 60;

            if (mt > 60) {
                ht = mt;
                mt = mt % 60;
                ht = ht / 60;
            }
        }
        System.out.println("La hora restultante es: "+ht + "h " + mt + "m " + aux + "s. ");
    }

    public void Resta() {
        int aux, ht = 0, mt = 0, st;

        Scanner sc = new Scanner(System.in);
        String hora;
        System.out.println("Introduce la hora 1: ");
        hora = sc.nextLine();
        String[] parts = hora.split(":");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        int h1 = Integer.parseInt(parts[0]);
        int m1 = Integer.parseInt(parts[1]);
        int s1 = Integer.parseInt(parts[2]);
        String resta;
        System.out.println("Introduce la hora 2: ");
        resta = sc.nextLine();
        String[] parte = resta.split(":");
        String parte1 = parts[0];
        String parte2 = parts[1];
        String parte3 = parts[2];
        int h2 = Integer.parseInt(parte[0]);
        int m2 = Integer.parseInt(parte[1]);
        int s2 = Integer.parseInt(parte[2]);

        h1 = h1 * 60;
        h2 = h2 * 60;
        m1 = (m1 + h1) * 60;
        m2 = (m2 + h2) * 60;
        s1 = s1 + m1;
        s2 = s2 + m2;
        if (s1 < s2) {
            st = s2 - s1;
        } else {
            st = s1 - s2;
        }
        aux = st % 60;
        if (st > 60) {
            mt = st / 60;

            if (mt > 60) {
                ht = mt;
                mt = mt % 60;
                ht = ht / 60;
            }
        }
        System.out.println("La hora restultante es: "+ht + "h " + mt + "m " + aux + "s. ");
    }
}
