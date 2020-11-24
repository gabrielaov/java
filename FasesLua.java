
package faseslua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputValores = new Scanner(System.in);
        
        int doisdias = inputValores.nextInt();
        int umdia = inputValores.nextInt();
        
        if (umdia >= 0 && umdia <=2){
            System.out.println("nova");
        }
        else if (umdia >=3 && umdia <= 96 && umdia > doisdias){
            System.out.println("crescente");
        }
        else if (umdia >=97 && umdia <=100){
            System.out.println("cheia");
        }
        else if (umdia <=96 && umdia >=3 && umdia < doisdias){
            System.out.println("minguante");
        }
        
        
    }//fecha main
    
}//fecha clss
