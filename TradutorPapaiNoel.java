/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradutorpapainoel;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TradutorPapaiNoel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pais;

        while (s.hasNext()) {
            pais = s.next();

            switch (pais) {
                case "brasil":
                    System.out.println("Feliz Natal!");
                    break;
                case "alemanha":
                    System.out.println("Frohliche Weihnachten!");
                    break;
                case "austria":
                    System.out.println("Frohe Weihnacht!");
                    break;
                case "coreia":
                    System.out.println("Chuk Sung Tan!");
                    break;
                case "espanha":
                    System.out.println("Feliz Navidad!");
                    break;
                case "grecia":
                    System.out.println("Kala Christougena!");
                    break;
                case "estados-unidos":
                    System.out.println("Merry Christmas!");
                    break;
                case "inglaterra":
                    System.out.println("Merry Christmas!");
                    break;
                case "australia":
                    System.out.println("Merry Christmas!");
                    break;
                case "portugal":
                    System.out.println("Feliz Natal!");
                    break;
                case "suecia":
                    System.out.println("God Jul!");
                    break;
                case "turquia":
                    System.out.println("Mutlu Noeller");
                    break;
                case "argentina":
                    System.out.println("Feliz Navidad!");
                    break;
                case "chile":
                    System.out.println("Feliz Navidad!");
                    break;
                case "mexico":
                    System.out.println("Feliz Navidad!");
                    break;
                case "antardida":
                    System.out.println("Merry Christmas!");
                    break;
                case "canada":
                    System.out.println("Merry Christmas!");
                    break;
                case "irlanda":
                    System.out.println("Nollaig Shona Dhuit!");
                    break;
                case "belgica":
                    System.out.println("Zalig Kerstfeest!");
                    break;
                case "italia":
                    System.out.println("Buon Natale!");
                    break;
                case "libia":
                    System.out.println("Buon Natale!");
                    break;
                case "siria":
                    System.out.println("Milad Mubarak!");
                    break;
                case "marrocos":
                    System.out.println("Milad Mubarak!");
                    break;
                case "japao":
                    System.out.println("Merii Kurisumasu!");
                    break;
                    
                default:
                    System.out.println("--- NOT FOUND ---");
            }
        }
    }
}
