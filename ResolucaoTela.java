
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("Sua tela tem resolução " + 
                            d.width + " x " + d.height );
        
    }
    
}
