/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gangorra;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Gangorra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p1 = s.nextInt();
        int c1 = s.nextInt();
        int p2 = s.nextInt();
        int c2 = s.nextInt();
        
        int e = p1 * c1;
        int d = p2 * c2;

        if ((p1 >= 10 && p1 <= 100)
                && (c1 >= 10 && c1 <= 100)
                && (p2 >= 10 && p2 <= 100)
                && (c2 >= 10 && c2 <= 100)) {
            
            if (e == d){
                System.out.println("0");
                
            }else if(e < d){
                System.out.println("1");
                
            }else{
                System.out.println("-1");
            }
        }
    }
}
