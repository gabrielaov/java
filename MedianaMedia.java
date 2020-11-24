package medianamedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner inputValores = new Scanner(System.in);
        
        int A;
        int B;
        int C;
        
        ArrayList resultado = new ArrayList();
        
        for (int i = 0;; i++){  
            
        A = inputValores.nextInt();
        B = inputValores.nextInt(); 
        
        if (A == 0 && B == 0){
            break;
        }
        
        C = (A*3)-(A+B);
        
        if (A == (A+B+C)/3 &&
                A>=1 && 
                B>=A &&
                A<=Math.pow(10,9)&&
                B<=Math.pow(10,9)){
            
            resultado.add(C);
        }
        
        }//fecha for
        
             
        for (int res = 0; res < resultado.size(); res ++){
        System.out.println(resultado.get(res));  
        }

    } //fecha main
    
} // fecha class
/**/