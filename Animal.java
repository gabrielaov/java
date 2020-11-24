/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tipo1 = scanner.next();
        String tipo2 = scanner.next();
        String tipo3 = scanner.next();

        if (tipo1.equals("vertebrado")) {
            switch (tipo2) {
                case "ave":
                    if (tipo3.equals("carnivoro")) {
                        System.out.println("aguia");

                    } else if (tipo3.equals("onivoro")) {
                        System.out.println("pomba");
                    }
                    break;

                case "mamifero":
                    if (tipo3.equals("onivoro")) {
                        System.out.println("homem");

                    } else if (tipo3.equals("herbivoro")) {
                        System.out.println("vaca");
                    }
                    break;

            } //fecha switch vertebrado

        } //fecha if vertebrado

        if (tipo1.equals("invertebrado")) {
            switch (tipo2) {
                case "inseto":
                    if (tipo3.equals("hematofago")) {
                        System.out.println("pulga");

                    } else if (tipo3.equals("herbivoro")) {
                        System.out.println("lagarta");
                    }
                    break;

                case "anelideo":
                    if (tipo3.equals("hematofago")) {
                        System.out.println("sanguessuga");

                    } else if (tipo3.equals("onivoro")) {
                        System.out.println("minhoca");
                    }
                    break;

            } //fecha switch invertebrado

        } //fecha if invertebrado

    }
}
