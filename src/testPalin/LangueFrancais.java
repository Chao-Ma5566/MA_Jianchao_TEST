package testPalin;

public class LangueFrancais implements LangueInterface{
    @Override
    public String Félicitation() {
        return Expressions.BienDit;
    }
    public String GetSalutation(int hour) {
        if (hour > 18) {
            return Expressions.Bonsoir;
        } else {
            return Expressions.Bonjour;
        }
    }

    public String GetAuRevoir(int hour) {
        if (hour > 18) {
            return Expressions.AuRevoirSoir;
        }else{
            return Expressions.AuRevoirMatin;
        }
    }
}
