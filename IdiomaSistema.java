
package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale localizacao = Locale.getDefault();
        System.out.println("Seu sistema está em " + 
                localizacao.getDisplayLanguage() + ".");
    }
    
}
