/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topn;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TopN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N >= 1 && N <= 100) {
            if (N == 1) {
                System.out.println("Top 1");

            } else if (N >= 2 && N <= 3) {
                System.out.println("Top 3");

            } else if (N >= 4 && N <= 5) {
                System.out.println("Top 5");
                
            } else if (N >= 6 && N <= 10){
                System.out.println("Top 10");
                
            }else if (N >= 11 && N <= 25){
                System.out.println("Top 25");
                
            }else if (N >= 26 && N <= 50){
                System.out.println("Top 50");
                
            }else if (N >= 51 && N <= 100){
                System.out.println("Top 100");
            }
        }
    }

}
