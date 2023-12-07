package testPalin;

public class LangueFrancaise implements LangueInterface{
    @Override
    public String Félicitation() {
        return Expressions.BienDit;
    }
    public String GetSalutation(int hour) {
        if (hour > 18) {
            return Expressions.Bonsoir;
        } else if(hour > 0 && hour < 6) {
            return Expressions.BonneNuit;
        } else {
            return Expressions.Bonjour;
        }
    }

    public String GetAuRevoir(int hour) {
        if (hour > 18) {
            return Expressions.AuRevoirSoir;
        }else if(hour > 0 && hour < 6) {
            return Expressions.DorsBien;
        }else{
            return Expressions.AuRevoirMatin;
        }
    }
}
