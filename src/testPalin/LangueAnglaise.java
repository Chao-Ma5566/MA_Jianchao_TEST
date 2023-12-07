package testPalin;

public class LangueAnglaise implements LangueInterface{
    @Override
    public String Félicitation() {
        return Expressions.WellSaid;
    }
    public String GetSalutation(int hour) {
        if (hour > 18) {
            return Expressions.GoodEvening;
        } else {
            return Expressions.Hello;
        }
    }

    public String GetAuRevoir(int hour) {
        if (hour > 18) {
            return Expressions.GoodbyeNight;
        }else{
            return Expressions.GoodbyeMorning;
        }
    }
}
