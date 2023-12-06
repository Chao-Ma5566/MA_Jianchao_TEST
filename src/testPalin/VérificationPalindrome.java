package testPalin;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class VérificationPalindrome {
    public static String Vérifier(String chaîne) {
        String miroir =  new StringBuilder(chaîne)
                .reverse()
                .toString();

        if(miroir.equals(chaîne)) {
            miroir = GetSalutation(7)
                    + System.lineSeparator()
                    + miroir
                    + System.lineSeparator()
                    + Expressions.BienDit
                    + System.lineSeparator()
                    + GetAuRevoir(7);
        }else{
            miroir = GetSalutation(7)
                    + System.lineSeparator()
                    + miroir
                    + System.lineSeparator()
                    + GetAuRevoir(7);
        }
        return miroir;
    }

    public static int getHour() {
        SimpleDateFormat time =  new SimpleDateFormat("HH");
        Date date = new Date();
        int intHour = Integer.parseInt(time.format(date));
        return intHour;
    }
    public static String GetSalutation(int hour) {

        if (hour > 18) {
            return Expressions.Bonsoir;
        }else{
            return Expressions.Bonjour;
        }
    }

    public static String GetAuRevoir(int hour) {

        if (hour > 18) {
            return Expressions.AuRevoirSoir;
        }else{
            return Expressions.AuRevoirMatin;
        }
    }
}