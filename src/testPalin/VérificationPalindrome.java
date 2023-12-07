package testPalin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VérificationPalindrome {
    private final LangueInterface langue;

    public VérificationPalindrome(LangueInterface langue) {
        this.langue = langue;
    }
    public String Vérifier(String chaîne, int heure) {
        String miroir =  new StringBuilder(chaîne)
                .reverse()
                .toString();

        if(miroir.equals(chaîne)) {
            miroir = this.langue.GetSalutation(heure)
                    + System.lineSeparator()
                    + miroir
                    + System.lineSeparator()
                    + this.langue.Félicitation()
                    + System.lineSeparator()
                    + this.langue.GetAuRevoir(heure);
        }else{
            miroir = this.langue.GetSalutation(heure)
                    + System.lineSeparator()
                    + miroir
                    + System.lineSeparator()
                    + this.langue.GetAuRevoir(heure);
        }
        return miroir;
    }

    public static int getHour() {
        SimpleDateFormat time =  new SimpleDateFormat("HH");
        Date date = new Date();
        int intHour = Integer.parseInt(time.format(date));
        return intHour;
    }
}