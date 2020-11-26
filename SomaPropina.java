/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somapropina;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class SomaPropina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        //definindo o formato do double para duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);

        String texto1 = s.next();
        String texto2 = s.next();
        
        //substituindo tudo que não é numero ou "." por nada, ref. ao primeiro texto
        String replace = texto1.replaceAll("[^.0-9]", "");
        //buscando apenas os primeiros 11 caracteres do primeiro texto, já com as substituições
        String cpf = replace.substring(0, 11);
        
        //buscando a partir do caracter 11, já com as substituições
        String valor1 = replace.substring(11);
        //substituindo tudo que não é numero ou "." por nada, ref. ao segundo texto
        String valor2 = texto2.replaceAll("[^.0-9]", "");
        
        //formatando o valor1 para apenas 2 casas decimais
        String replacevlr1 = df.format(Double.parseDouble(valor1));   
        //transformando o valor1 formatado em double
        double resvlr1 = Double.parseDouble(replacevlr1.replaceAll(",", "."));
        
        //formatando o valor2 para apenas 2 casas decimais
        String replacevlr2 = df.format(Double.parseDouble(valor2));
        //transformando o valor2 formatado em double
        double resvlr2 = Double.parseDouble(replacevlr2.replaceAll(",", "."));
        
        //calculo do total de propina
        double propina = resvlr1 + resvlr2;

        System.out.println("cpf " + cpf);

        System.out.printf("%.2f\n", propina);
        

    }

}
/**/
