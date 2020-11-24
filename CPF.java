
package cpf;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        Scanner inputCpf = new Scanner(System.in);
        String cpf = inputCpf.next();
        
        System.out.println(cpf.substring(0,3));
        
        System.out.println(cpf.substring(4,7));
        
        System.out.println(cpf.substring(8).substring(0,3));
        
        System.out.println(cpf.substring(12)); 
     
    } 
}
