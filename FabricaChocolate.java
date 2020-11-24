/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricachocolate;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class FabricaChocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;
        int volume;
        double aresta;

        for (int i = 0;; i++) {
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            volume = a * b * c;
            aresta = Math.cbrt(volume);
            

            System.out.println(String.format("%.0f", Math.floor(aresta)));
        }

    }

}
