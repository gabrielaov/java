/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmedespertador;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class AlarmeDespertador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int h1;
        int m1;
        int h2;
        int m2;

        for (int i = 0;; i++) {
            h1 = s.nextInt();
            m1 = s.nextInt();
            h2 = s.nextInt();
            m2 = s.nextInt();

            if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
                break;
            }

            if ((h1 >= 0 && h1 <= 23) && (h2 >= 0 && h2 <= 23)
                    && (m1 >= 0 && m1 <= 60) && (m2 >= 0 && m2 <= 60)) {

                if ((h1 < h2) || ((h1 == h2) && (m1 < m2))) {
                    int res = (((24 * 60) - (h1 * 60)) - m1) - (((24 * 60) - (h2 * 60)) - m2);

                    System.out.println(res);
                }

                if (((h1 == h2) && (m1 > m2)) || h1 > h2) {
                    int res = (((24 * 60) - (h1 * 60)) - m1) + ((h2 * 60) + m2);

                    System.out.println(res);
                }

                if (h1 == h2 && m1 == m2) {
                    System.out.println(24 * 60);
                }

            }

        }

    }

}
