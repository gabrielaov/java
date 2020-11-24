
package tridu;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner inputCartas = new Scanner(System.in);
        
        int carta1 = inputCartas.nextInt();
        int carta2 = inputCartas.nextInt();

        
        if (carta1 == carta2){
            System.out.println(carta1);
        }
        else if (carta1 > carta2){
            System.out.println(carta1);
        }
        else if (carta1 < carta2){
            System.out.println(carta2);
        }
        
   
        
    }
    
}
