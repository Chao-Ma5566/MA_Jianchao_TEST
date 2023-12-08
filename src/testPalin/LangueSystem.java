package testPalin;
import java.util.Locale;

public class LangueSystem {
    public static LangueInterface getSystemLangue() {
        Locale locale = Locale.getDefault();

        String langue = locale.getLanguage();
        if (langue == "fr"){
            return new LangueFrancaise();
        }else if(langue == "en"){
            return new LangueAnglaise();
        }else{
            System.out.println("Sorry, we don't support your language yet, bu default we will show results in english" + System.lineSeparator());
            return new LangueAnglaise();
        }
    }
}
